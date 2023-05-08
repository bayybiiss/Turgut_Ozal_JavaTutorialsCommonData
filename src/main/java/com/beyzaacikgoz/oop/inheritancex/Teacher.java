package com.beyzaacikgoz.oop.inheritancex;

public class Teacher extends Person{
    @Override
    public void deneme(String name) {
        super.deneme(name);
    }
}









/*import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Teacher {
    private long id;
    private String name;
    private String surname;
}*/
