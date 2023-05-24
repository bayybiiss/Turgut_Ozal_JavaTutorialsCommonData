package com.beyzaacikgoz.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder

public class RegisterDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Date date=new Date(System.currentTimeMillis());

}
