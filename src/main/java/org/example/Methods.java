package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static User gerUserId(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        for (int i = 0; i < userList.size(); i++) {
            if (name.equals(userList.get(i).getUserName())) {
                System.out.println("Ваш ID: " + userList.get(i).getUserId());
                return userList.get(i);
            }else {
                System.out.println("Имя некорректно. Введите другое");
            }
        }
        return null;
    }

    public static void getUserAmount(User user) {
        try {
            ArrayList<Bill> billamount = user.getBillList();



        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id счета: ");
        Integer id = sc.nextInt();
        for (int i = 0; i < billamount.size(); i++) {
            if (id == billamount.get(i).getBillId()) ;
            System.out.println("Баланс на счете: " + billamount.get(i).getBillAmount());
        }
        }catch (NullPointerException e){
            System.out.println("Пользователя не существует");
        }
    }
}
