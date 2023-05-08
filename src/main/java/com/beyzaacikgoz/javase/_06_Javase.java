package com.beyzaacikgoz.javase;

public class _06_Javase {
    //Loop--Döngüler

    public static void loopFor(){
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
    }

    public static void loopWhile() {
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
    }

    public static void loopDoWhile(){
        int i=1;
        do {
            System.out.print(i+" ");
            i++;
        }while ( i<= 10);
    }
    public static void main(String[] args) {
        loopFor();
        System.out.println();
        loopWhile();
        System.out.println();
        loopDoWhile();
    }

}
