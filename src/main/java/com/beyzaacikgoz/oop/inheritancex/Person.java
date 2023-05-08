package com.beyzaacikgoz.oop.inheritancex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private long id;
    private String name;
    private String surname;

    public void deneme(String name){
        System.out.println(name);
    }
}
