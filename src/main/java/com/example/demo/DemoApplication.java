package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // Mantenemos el puerto 8085 que ya te funcionó
        System.setProperty("server.port", "8085");
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class HelloController {

    // Endpoint principal (Raíz)
    @GetMapping("/")
    public String hello() {
        return "<h1>Servidor de Carlos Eduardo</h1><p>Estado: <b>CI/CD Funcionando perfectamente</b></p>";
    }

    // NUEVO ENDPOINT: Tu IP:8085/api/info
    @GetMapping("/api/info")
    public Map<String, String> getInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("Grupo", "Cambatec");
        info.put("Integrates", "Roger,Emilio,Carlos Eduardo,Guincha,Jhon");
        info.put("proyecto", "Laboratorio 4 - Modulo 4");
        info.put("tecnologias", "Spring Boot, Jenkins, GitHub, Linux");
        info.put("puerto", "8085");
        return info;
    }
}