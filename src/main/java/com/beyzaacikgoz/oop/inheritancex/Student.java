package com.beyzaacikgoz.oop.inheritancex;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student extends Person{

    private String unicodeCharacter;

    public Student(long id, String name, String surname, String unicodeCharacter) {
        super(id, name, surname);
        this.unicodeCharacter = unicodeCharacter;
    }

    public Student(long id, String name, String surname) {
        super(id, name, surname);

    }


    @Override
    public void deneme(String name) {
        super.deneme(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "unicodeCharacter='" + unicodeCharacter + '\'' +
                "} " + super.toString();
    }
}



/*import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private long id;
    private String name;
    private String surname;
    }
    */


