package com.bcafinance.fundamental.ujian1;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author Kyoto a.k.a Riky Hidayat
Java Developer
Created on 11/11/2022
@Last Modified 11/11/2022 13:41
Version 1.0
*/

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
    int intNumber = 0;
    int intTotal= 0;
    boolean isAgain = true;
    Scanner sn = new Scanner(System.in);

    try {
        int i=0;
        do {
            System.out.println("Masukan angka sepuasnya : ");
            intNumber = sn.nextInt();
            intTotal+=intNumber;
            i++;
        }while ( i<10);{
            isAgain=true;
        }
}
catch (Exception e){
        System.out.println("Jumlah:" +intTotal);
    }

}
}
