package com.beyzaacikgoz.springboot._3_SpringAPI;
import com.beyzaacikgoz.springboot.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Log4j2
public class LoginApiImpl {
    // http://localhost:8080/api/v1/rest1
    @GetMapping("/rest1")
    public RegisterDto getRest1(){
        return RegisterDto.builder()
                .id(1L)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza@gmail.com")
                .password("Ba123456@.")
                .build();
    }

    // http://localhost:8080/api/v1/rest2/1
    @GetMapping("/rest2/{id}")
    public RegisterDto getRest2(@PathVariable(name="id") Long id){
        return RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza@gmail.com")
                .password("Ba123456@.")
                .build();
    }

    // http://localhost:8080/api/v1/rest3
    // http://localhost:8080/api/v1/rest3/1
    @GetMapping({"/rest3","/rest3/{id}"})
    public RegisterDto getRest3(@PathVariable(name="id",required = false) Long id){
        return RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza@gmail.com")
                .password("Ba123456@.")
                .date(new Date(System.currentTimeMillis()))
                .build();
    }

    // http://localhost:8080/api/v1/rest4
    // http://localhost:8080/api/v1/rest4/0
    // http://localhost:8080/api/v1/rest4/1
    @GetMapping({"/rest4","/rest4/{id}"})
    public ResponseEntity<RegisterDto>  getRest4(@PathVariable(name="id",required = false) Long id){
        if(id==null){
            log.error("404 Not Found hatası");
            return ResponseEntity.notFound().build();
        } else if(id==0){
            log.error("400 Bad Request hatası");
            return ResponseEntity.badRequest().build();
        }
        RegisterDto registerDto=RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza@gmail.com")
                .password("Ba123456@.")
                .date(new Date(System.currentTimeMillis()))
                .build();
        log.info(registerDto);
        return ResponseEntity.ok(registerDto);
    }

    // http://localhost:8080/api/v1/rest5
    // http://localhost:8080/api/v1/rest5/0
    // http://localhost:8080/api/v1/rest5/1
    @GetMapping({"/rest5","/rest5/{id}"})
    public ResponseEntity<?>  getRest5(@PathVariable(name="id",required = false) Long id){
        if(id==null){
            log.error("404 Not Found hatası");
            return ResponseEntity.notFound().build();
        } else if(id==0){
            log.error("400 Bad Request hatası");
            return ResponseEntity.badRequest().build();
        }
        RegisterDto registerDto=RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza@gmail.com")
                .password("Ba123456@.")
                .date(new Date(System.currentTimeMillis()))
                .build();
        log.info(registerDto);
        return ResponseEntity.ok(registerDto);
    }

    //////////////////////////////////////////////////////

    // http://localhost:8080/api/v1/rest6?id=1
    @GetMapping("/rest6")
    public RegisterDto getRest6(@RequestParam(name="id") Long id){
        return RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname("Acikgoz")
                .email("beyza123@gmail.com")
                .password("Ba123456@.")
                .build();
    }

    // http://localhost:8080/api/v1/rest7?id=1&surname=Mizrak
    @GetMapping("/rest7")
    public RegisterDto getRest7(@RequestParam(name="id") Long id, @RequestParam(name="surname") String surname){
        return RegisterDto.builder()
                .id(id)
                .name("Beyza")
                .surname(surname)
                .email("beyza@gmail.com")
                .password("Beyza123.")
                .build();
    }
}
