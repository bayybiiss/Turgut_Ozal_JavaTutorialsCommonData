package com.beyzaacikgoz.controller;

import com.beyzaacikgoz.business.dto.RegisterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Map;
@CrossOrigin
public interface IRegisterApi {
    //CREATE
    public ResponseEntity<RegisterDto> createRegister(RegisterDto userRegisterDto);

    //LIST
    public ResponseEntity<List<RegisterDto>> getAllRegisters();

    //FIND
    public ResponseEntity<?>  getFindByRegister(Long id);

    //DELETE
    public ResponseEntity<Map<String,Boolean>>  deleteRegister(Long id);

    //UPDATE
    public ResponseEntity<RegisterDto>  updateRegister(Long id,RegisterDto registerDto);

}
