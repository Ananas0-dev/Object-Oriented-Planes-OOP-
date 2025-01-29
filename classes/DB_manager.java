package classes;

import java.sql.*;
import javax.swing.JTextArea;


public class DB_manager {

    // Replace with your actual database connection details
    private  String url = "jdbc:mysql://localhost:3306/airport_project";
    private  String username = "root";
    private  String password = "LwLw_po";

    // Connection object (use an instance variable for constructor)
    private Connection connection;
    
    // Constructor with connection details
    public DB_manager(String url, String username, String password) throws SQLException {
        this.url = url;
        this.username = username;
        this.password = password;
        connect();
    }

    public DB_manager() {
   
    }

    // Connect to the database
    public void connect() throws SQLException {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get a connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error loading JDBC driver: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unkown error accoured at connect()"+ e.getMessage());
        }
    }

    // Close the database connection (should be called when finished)
    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            try {
                connection.close();
                System.out.println("Disconnected from database.");
            } catch (SQLException e) {
                // Handle closing errors (log or re-throw)
                System.err.println("Error closing connection: " + e.getMessage());
            }
            catch(Exception e){
            System.out.println("Unkown error accoured at closeConnection()"+ e.getMessage());
        }
        }
    }

    // Example: Get a connection (no need to call connect() here)
    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connect(); // Only connect if needed
        }
        return connection;
    }

    // Execute a statement with internal exception handling  /!!!!!!!!!!!  used with sql command returns nothing like update insert delete
    public void executeStatement(String sql) {         
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.err.println("Error executing statement: " + e.getMessage());
            // Consider logging the error for further analysis
        } 
        catch(Exception e){
            System.out.println("Unkown error accoured at executeStatement()"+ e.getMessage());
        }
        
        finally {
            // Close resources (can be improved with resource management)
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // Handle statement closing error (log or ignore)
                    System.err.println("Error closing statement: " + e.getMessage());
                }
                catch(Exception e){
                    System.out.println("Unkown error accoured at executeStatement()"+ e.getMessage());
                }
                
            }
            // Consider closing connection elsewhere if needed
        }
    }
        // used with commands returns a result like select 
    public ResultSet executeQuery(String sql) throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
        }
    
 
    
    
    public void executePreparedStatement(String sql, Object... parameters) throws SQLException {     // make another for result set 
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);

            // Set parameters based on data types
            for (int i = 0; i < parameters.length; i++) {
                Object param = parameters[i];
                if (param instanceof String) {
                    pstmt.setString(i + 1, (String) param);
                } else if (param instanceof Integer) {
                    pstmt.setInt(i + 1, (Integer) param); 
                }                                                 //add for double
            }

            pstmt.executeUpdate();
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close(); // Close the connection independently
            }
        }
    }

}



