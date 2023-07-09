package com.beyzaacikgoz.Backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.File;

@Controller
@RestController
@RequestMapping("/mvc/v1")
@CrossOrigin
public class FolderController {

    //http://localhost:8080/folderController/createFolder
    @PostMapping("/createFolder")
    @ResponseBody
    public String createFolder(@RequestBody String folderName) {
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String folderPath = desktopPath + folderName;

        File folder = new File(folderPath);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                return "Klasör oluşturuldu!";
            } else {
                return "Klasör oluşturulamadı!";
            }
        } else {
            return "Bu isimde bir klasör zaten var!";
        }
    }
}
