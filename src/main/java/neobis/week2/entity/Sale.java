package neobis.week2.entity;

import java.util.Date;

public class Sale {
    private Long id;
    private Date date;
    private int bookId;
    private int quantitySold;
    private double totalPrice;
    private int customerId;

    public Sale() {
    }

    public Sale(Long saleId, Date date, int bookId, int quantitySold, double totalPrice, int customerId) {
        this.id = saleId;
        this.date = date;
        this.bookId = bookId;
        this.quantitySold = quantitySold;
        this.totalPrice = totalPrice;
        this.customerId = customerId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
