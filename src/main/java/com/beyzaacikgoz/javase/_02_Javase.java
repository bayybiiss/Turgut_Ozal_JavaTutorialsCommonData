package com.beyzaacikgoz.javase;

public class _02_Javase {
    //Method => void - return
    public static void voidliParametresiz() {
        System.out.println("voidli parametresiz ");
    }
    public static void voidliParametreli(String name){
        System.out.println( "voidli parametreli "+name);
    }
    //return method
    public static String voidsizParametresiz(){
        return "voidsiz parametresiz ";
       // System.out.println("voidli parametresiz");
    }

    public static String voidsizParametreli(int number){
        return "voidsiz parametreli "+number;
        // System.out.println("voidli parametresiz"+number);
    }

    public static void main(String[] args) {
        voidliParametreli("beyza");
        voidliParametresiz();
        //voidsizParametresiz();  voidsizParametreesiz method direkt bu şekilde çalışmaz
        /*çünkü return datalı methodlarda değişken yapısı tekrardan gösterilmeli
        * */
        String changeData = voidsizParametresiz();
        System.out.println(changeData);
        String changeData2 = voidsizParametreli(44);
        System.out.println(changeData2);


       /* _02_Javase data =new _02_Javase();
        data.voidliParametreli("beyza");*/

        /*
        * üstteki yapıyı voidliParametreli methodlarda "static" yoksa kullanırız
        * eğer public static void şeklinde method kullanıyorsak
        * tekrardan classı bir data da tutmaya gerek yok
        * ama static değilse method classı yeniden bir datada tanımlamak lazım
        * */
    }
}
