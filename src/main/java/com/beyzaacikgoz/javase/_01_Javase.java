package com.beyzaacikgoz.javase;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class _01_Javase {
    public static void main(String[] args) {
        String variableData="Merhabalar";

        /*
        * Soru 1
        * 1. dereceden 2 bilinmeyenli denklem
        * y=3x+4k
        * x=5
        * k=3
        * */

        /*
        * Soru 2
        * Dereceyi Fahrenhaya Çeviren
        * (derece*9/5)+32
        *0 derece 32 fahrenhayttır
        * */

        /*Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String data=klavye.nextLine();
        System.out.println(data);
        System.err.println(data);
        System.err.println(variableData);*/

        //sayıyı stringe çevirmek
        int number =44;
        String str1=String.valueOf(number); //object
        String str2=Integer.toString(number);

        //String yapıyı integer çevirme
        String str3="44";
        System.out.println(str3+14);
        System.out.println(44+16);
        int number2=Integer.valueOf(str3);
        int number3=Integer.parseInt(str3);
        Integer str4 = Integer.valueOf(String.valueOf(str3));
        Integer str5 = Integer.valueOf(str3);
        System.out.println(str5 +16);

        //Escape character
        System.out.println("1.satır");
        System.out.println("2.satır");
        System.out.println("3.satır\n4.satır\n");

        //Math
        System.out.println(Math.max(3,-100)); //max sayıyı verir
        System.out.println(Math.min(3,-100)); //min sayıyı verir
        System.out.println(Math.pow(2,5));    //üss bulur
        System.out.println(Math.abs(-100));   //mutlak değer
        System.out.println(Math.sqrt(Math.abs(-100))); //karekök

        System.out.println(Math.floor(4.9)); //asagi yuvarlama
        System.out.println(Math.ceil(4.1));  //yukari yuvarlama
        System.out.println(Math.round(6.1)); //yuvarlama
        System.out.println(Math.round(6.5));
        System.out.println(Math.sin(45));    //sinüs


        //Rastgele Random
        System.out.println(Math.random()*10+1);  //10 ile 1 arasında random sayı üretme
        Random random=new Random();              //Random sınıf
        int number4 =random.nextInt(10)+1; //10 ile 1 arasında random sayı
        System.out.println(number4);

    }
}
