package org.example;

import java.util.ArrayList;

public class User {
    private Integer userId;
    private String userName;
    private ArrayList<Bill> billList;

    public ArrayList<Bill> getBillList() {
        return billList;
    }

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.billList = new ArrayList<>();
    }

    public void addBill(Bill bill) {
        billList.add(bill);
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
