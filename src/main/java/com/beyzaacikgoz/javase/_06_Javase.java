package com.beyzaacikgoz.javase;

import java.util.*;

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

    //ExceptionHandling
    public static void exceptionHandling(){
        System.out.println("ilk data");
        try {
            int i=4/0;
        }catch (ArithmeticException ai){
            ai.printStackTrace();
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("son data");

    }


    //array: eleman sayısı belli olan datalarda kulllanılır
    public static void arrayTutorials(){
        int[] arr= new int[4];
        arr[0]=5;
        arr[1]=3;
        arr[2]=4;
        System.out.println(arr[0]);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");                  //5-3-4-0
            /*System.out.print(i+" =>"+arr[i]);
            System.out.println();*/
        }
        System.out.println(" ");
        Arrays.sort(arr); //dizinin içeriğini küçükten büyüğe sıralar

        for (int temp : arr){
            System.out.print(temp+" ");        //yukarıda dizi sıralandığı için 0-3-4-5
        }
    }

    //collection: eleman sayısı belli olmayan datalarda kullanılır
    public static void colllectionTutorials1(){
        //Liste: tekrar eden verileride gösterir
        //Liste=> Lav (linkedList:çıkarma-silme, ArrayList:ekleme-arama, Vector)
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(10); //10 tekrar ettiği halde yinede gösterir
        list.add(20);
        list.add(40);

        //listeyi gösterme
        for (Integer temp: list){
            System.out.println(temp+" ");
        }
        System.out.println();

        //listeyi gosterme
        list.stream().forEach(System.out::println);

        System.out.println("");

        //küçükten büyüğe doğru sıralama
        Collections.sort(list);


        //listeyi gösterme
        list.stream().forEach((temp)->{
            System.out.println(temp);
        });

    }
    public static void colllectionTutorials2(){
        //Küme: tekrarsız verileri gösterilir
        //Küme=> HalaT (HashSet:random sırada gösterir, LinkedHashSet:eklenen sırada gosterir, Tremap:küçükten büyüğe doğru sıralar

        Set<Integer> integerSet=new LinkedHashSet<>();
        integerSet.add(10);
        integerSet.add(30);
        integerSet.add(10); //10 tekrar ettiği halde sadece bir kez gösterir
        integerSet.add(20);
        integerSet.add(40);

        for (Integer temp: integerSet){
            System.out.println(temp+" ");
        }
    }

    public static void colllectionTutorials3(){
        //Map
        Map<String,Object> mapList =new TreeMap<>();
        mapList.put(UUID.randomUUID().toString(),"Malatya");
        mapList.put(UUID.randomUUID().toString(),"Elazığ");

        for (String temp: mapList.keySet()){
            System.out.println(temp+" => " +mapList.get(temp));
        }
    }

    public static void colllectionTutorials4(){
        //1-9 arasında rastgele 5 tane sayı oluşturulsun
        //bu sayıların toplamını veren algoritma yazın
        //çift olanlardan kaç tane
        //çift olanların toplamı
        //tek olanlardan kaç tane
        //tek olanların toplamı

        int[] arr =new int[5];
        Random random= new Random();
        int sum=0;
        int twin=0, twinSum=0;
        int odd=0, oddSum=0;

        for (int i=0; i<arr.length; i++){
            int temp=random.nextInt(9)+1;
            arr[i]=temp;
            sum+=arr[i];
            if (arr[i]%2==0){
                twin++;
                twinSum+=arr[i];
            }
            else {
                odd++;
                oddSum+=arr[i];
            }
        }
        System.out.println("Çiftlerin sayısı="+twin +" Çiftlerin Toplamı="+twinSum);
        System.out.println("Teklerin Sayısı="+odd +" Tekelrin Toplamı= "+oddSum);
        for (int temp: arr){
            System.out.print(temp+" ");
        }
        System.out.println("Toplam="+sum);
    }
    public static void main(String[] args) {
        /*loopFor();
        System.out.println();
        loopWhile();
        System.out.println();
        loopDoWhile();
        exceptionHandling();
        arrayTutorials();*/
        //colllectionTutorials1();
        colllectionTutorials2();
        colllectionTutorials3();
        colllectionTutorials4();
    }

}
