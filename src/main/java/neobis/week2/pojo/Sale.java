package neobis.week2.pojo;

import java.util.Date;

public class Sale {
    private int id;
    private Date date;
    private int bookId;
    private int quantitySold;
    private double totalPrice;
    private int customerId;

    public Sale() {
    }

    public Sale(int saleId, Date date, int bookId, int quantitySold, double totalPrice, int customerId) {
        this.id = saleId;
        this.date = date;
        this.bookId = bookId;
        this.quantitySold = quantitySold;
        this.totalPrice = totalPrice;
        this.customerId = customerId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}
