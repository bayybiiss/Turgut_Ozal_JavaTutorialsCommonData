package com.beyzaacikgoz.oop.inheritancex;

public class InheritanceMainClass {
    public static void main(String[] args) {

        //Person
        Person person = new Person();
        person.setId(1L);
        person.setName("Personel adı-1");
        person.setSurname("Personel soyadı_1");
        System.out.println(person);

       //Student
        Student student= new Student();
        student.setId(1);
        student.setName("öğrenci adı-1");
        student.setSurname("öğrenci soyadı -1");
        student.deneme("stu");
        student.setUnicodeCharacter("unicode 447");
        System.out.println(student);



        //Teacher
        Teacher teacher = new Teacher();
        teacher.setId(2);
        teacher.setName("Öğretmen adı-1");
        teacher.setSurname("Öğretmen soyadı-1");
        teacher.deneme("öğrt");
        System.out.println(teacher);
       /* //Teacher
        Teacher teacher = Teacher.builder().id(2L).name("Öğretmen-1").surname("öğretmen soyadı-1").build();
        System.out.println(teacher);*/
    }
}
