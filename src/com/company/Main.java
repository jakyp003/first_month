package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(tempAge(30,35));
        System.out.println(tempAge(50,20));
        System.out.println(tempAge(7,-10));
        System.out.println(tempAge(15,35));
        System.out.println(tempAge(60,35));




    }

    public static String tempAge(int age, int temp) {


        String res1 = "можно идти гулять";
        String res2 = "оставайтесь дома";

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return res1;
        } else if (age <= 20 && temp > 0 && temp <= 28) {
            return res1;
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return res1;
        } else {
            return res2;}
    }



}
