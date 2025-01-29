import Frames.*;    //including the frames pakage
import classes.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import images.*;   //if needed
import javax.swing.JFrame;



/**
 *
 * @author ...
 */
public class main {
    public static void main(String[] args) {
        
        Frame_home homePage = new Frame_home();
        homePage.setSize(528, 528);
        homePage.setVisible(true);
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.setLocationRelativeTo(null);
        
    }
}
