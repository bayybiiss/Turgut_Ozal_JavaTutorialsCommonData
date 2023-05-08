package com.beyzaacikgoz.oop.abstracts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

abstract public class Person {
    private long id;
    private String name;
    private String surname;

    public void deneme(String name){
        System.out.println(name);
    }

   abstract public void govdesizMethos(int number);

}
