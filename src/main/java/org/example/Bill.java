package org.example;

public class Bill {
    private Integer billId;
    private User userId;
    private long billAmount;

    public Bill(Integer billId, User userId, long billAmount) {
        this.billId = billId;
        this.userId = userId;
        this.billAmount = billAmount;
        userId.addBill(this);
    }

    public Bill(User userId, long billAmount) {
        this.userId = userId;
        this.billAmount = billAmount;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public long getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(long billAmount) {
        this.billAmount = billAmount;
    }
}
