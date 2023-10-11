package org.example;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(10, "Lera");
        User user2 = new User(11, "Max");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        User user = Methods.gerUserId(users);
        System.out.println(user);

        Bill bill1 = new Bill(265, user1, 10000);
        ArrayList<Bill> billsUser1 = new ArrayList<>();
        billsUser1.add(bill1);
        user1.addBill(bill1);

        Methods.getUserAmount(user);


    }
}