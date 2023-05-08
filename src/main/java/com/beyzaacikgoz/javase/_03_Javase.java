package com.beyzaacikgoz.javase;

import javax.swing.*;
import java.util.Scanner;

public class _03_Javase {
    //String

    public static void main(String[] args) {
        String value = "Java learning Java ";
        System.out.println(value);
        System.out.println(value.length()); //uzunluk
        System.out.println(value.trim().length()); //
        System.out.println(value.startsWith("J")); //J ile mi başlıyor
        System.out.println(value.endsWith(" "));   // boşlukla mı bitiyor
        System.out.println(value.toUpperCase());   //tüm harfleri büyük yap
        System.out.println(value.toLowerCase());   // tüm harfleri küçült
        System.out.println(value.charAt(0));      // 0. karakteri ver
        System.out.println(value.indexOf("Java")); //soldan başlayıp kaçıncı indexte Java var onu yazar
        System.out.println(value.lastIndexOf("Java")); //sağdan başlayarak Java kaçıncı indexte onu bulur
        System.out.println(value.substring(2)); //2. karakterden sonrasını yazar
        System.out.println(value.substring(0, 3)); //0 ile 3. index arasını çalıştırrı

        stringHomework();
    }



        public static void stringHomework(){

            System.out.println("Kullanıcının ismi: ");
            Scanner klavye = new Scanner(System.in);
            System.out.println(klavye);
            String data = klavye.nextLine();
            System.out.println(data.length());
            JFrame f;
            f= new JFrame();
            String lastname= JOptionPane.showInputDialog(f,"Soyisim Gir:");

            System.out.println(lastname.length());

        // Ödev: Kullanıcıdan aldığınız isim ve soyismin; (isimi: scanner ve soyismi: jOptionalPane)
        //  bu kelimenin harf sayısı ? [ ipucu: length() ]
        //  bu kelimenin bütün karakteri büyük yapalım ? [ ipucu: toUpperCase()]
        //  bu kelimenin bütün karakteri küçük yapalım ? [ ipucu: toLowerCase()]
        //  bu kelimenin başında ve sonunda boşlukları alalım ? [ ipucu: trim()]
        //  bu kelimenin j ile başlıyoru mu ?   [ ipucu: startsWith("j")]
        //  bu kelimenin a ile biter mi ?   [ ipucu:  endsWith("a")]
        //  bu kelimenin ilk harfi ? [ ipucu: charAt(0)]
        //  bu kelimenin içinde baştan Altan geçiyor mu ? [ ipucu: indexOf("java")]
        //  bu kelimenin içinde sondan Berkan geçiyor mu ? [ ipucu: lastIndexOf("java")]
        //  bu kelimenin 4.harften sonra gösterilsin ? [ ipucu: substring(4)]
        //  bu kelimenin sonuna INC ekleyelim  ? [ ipucu: concat(".INC")]
        //  bu kelimenin içerisinde java44 geçiyor mu ? [ ipucu: contains("java44")]
        //  bu kelimenin "deneme" ile aynı mı ?  [ipucu: ipucu: equals("deneme");]

    }
 }

