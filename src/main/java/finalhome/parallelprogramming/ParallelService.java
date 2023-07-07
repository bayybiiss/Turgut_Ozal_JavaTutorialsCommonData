package finalhome.parallelprogramming;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ParallelService extends Thread{
    public static final String PERSON_URL="C:\\Users\\Excalibur\\IdeaProjects\\person.txt";
    public static final String SECRET_URL="C:\\Users\\Excalibur\\IdeaProjects\\secret.txt";

    //1. Veri
    public String userDataInformation(){
        Scanner klavye = new Scanner(System.in);
        String userName,password,email;
        System.out.println("Adınınzı Girin");
        userName=klavye.nextLine();
        System.out.println("Password Girin");
        password=klavye.nextLine();
        System.out.println("Email Girin");
        email=klavye.nextLine();
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(userName).append("\n").append(password).append("\n").append(email);
        return stringBuilder.toString();
    }

    public void  fileIoUserDataInformation() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PERSON_URL, false))) {
            String userData = userDataInformation();
            bufferedWriter.write(userData);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ////////////////////////////////////////////////////////////////
        //2. Veri
    public String userDataSecretInformation(){
        Scanner klavye = new Scanner(System.in);
        String secretInformation;
        System.out.println("secretInformation Girin");
        secretInformation=klavye.nextLine();
        //secretInformation=JOptionPane.showInputDialog("secretInformation Girin");
        return secretInformation;
    }
    public void  fileIoUserDataSecretInformation() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SECRET_URL, false))) {
            String userData = userDataSecretInformation();
            bufferedWriter.write(userData);
            bufferedWriter.flush();
            System.out.println("Bilgiler dosyaya kaydedildi.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //MultiThread
    public static void main(String[] args) throws InterruptedException {
        //1. Thread
        ParallelService parallelService1= new ParallelService();
        parallelService1.fileIoUserDataInformation();// fileIoUserDataInformation

        //2. Thread
        ParallelService parallelService2= new ParallelService();
        parallelService2.fileIoUserDataSecretInformation();//fileIoUserDataSecretInformation

        parallelService1.start();
        parallelService1.join(); //1. thread'in tammamlanmasını bekler

        parallelService2.start();
        parallelService2.join();// 2. thread'in tammalanamasınını bekler
    }


}

