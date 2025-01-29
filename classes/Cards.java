package classes;

import java.util.Date;

public class Cards {
    private String cardNumber;
    private String cardName;
    private int cvv;
    private Date expirationDate;  // ws date
    private String type; 
    private double amount;

    // Default constructor
    public Cards() {
    }

    public Cards(String cardNumber, String cardName, int cvv, Date expirationDate, String type, double amount) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.type = type;
        this.amount = amount;
    }

    // Getters and setters

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cvv=" + cvv +
                ", expirationDate=" + expirationDate +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}