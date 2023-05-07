package com.beyzaacikgoz;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import java.util.TimeZone;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
})

//@SpringBootApplication
public class JavaTutorialsCommonDataApplication {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    //PSVM
    public static void main(String[] args) {
        //Disables headless JOptionPane
        System.setProperty("java.awt.headless","false");

        SpringApplication.run(JavaTutorialsCommonDataApplication.class, args);
    }//PSVM END
}//END CLASS
