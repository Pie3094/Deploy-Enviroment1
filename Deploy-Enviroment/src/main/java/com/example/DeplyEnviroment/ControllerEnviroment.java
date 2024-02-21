package com.example.DeplyEnviroment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEnviroment {
    @Value("${devName}")
    String devName;

    @Value("${authCode}")
    String authCode;

    @GetMapping("/get")
    public String getProperty() {
        return "Ciao come stai " + devName + ". Il tuo codice autenticativo è: " + authCode;
    }
}
