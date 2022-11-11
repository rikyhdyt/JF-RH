package com.bcafinance.fundamental.ujian1;
import java.util.Random;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author Kyoto a.k.a Riky Hidayat
Java Developer
Created on 11/11/2022
@Last Modified 11/11/2022 14:13
Version 1.0
*/

public class SoalDua {
    public static void main(String[] args) {

        String strK = "bcdfghjklmnpqrstvwxyz";
        String strV = "aiueo";

        char[] charK = strK.toCharArray();
        char[] charV = strV.toCharArray();

        int b = 0;
        Random rand = new Random();
        b = rand.nextInt(2);

        for (int i = 0; i < rand.nextInt(6, 7); i++) {
            if (i == 0) {
                if (b == 1) {
                    char charUpper = Character.toUpperCase(charK[rand.nextInt(21)]);
                    System.out.print(charUpper);
                } else {
                    char charUp = Character.toUpperCase(charV[rand.nextInt(5)]);
                    System.out.print(charUp);
                }
            } else if (i % 2 == 1) {
                if (b == 1) {
                    System.out.print(charV[rand.nextInt(5)]);
                } else if (b == 0) {
                    System.out.print(charK[rand.nextInt(21)]);
                }
            } else if (i % 2 == 0) {
                if (b == 1) {
                    System.out.print(charK[rand.nextInt(21)]);
                } else if (b == 0) {
                    System.out.print(charV[rand.nextInt(5)]);
                }
            }
        }
        for (int i = 0; i <= rand.nextInt(100); i++) {
            b = rand.nextInt(2);
            if (b == 1) {
                System.out.print(charK[rand.nextInt(21)]);
            } else {
                System.out.print(charV[rand.nextInt(5)]);
            }
        }
    }
}


