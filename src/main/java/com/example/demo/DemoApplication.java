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
        return "<h1>Servidor de Cambatec</h1><p>Estado: <b>CI/CD Funcionando perfectamente</b></p>";
    }

    // NUEVO ENDPOINT: Tu IP:8085/api/info
    @GetMapping("/api/info")
    public String getInfo() {
        return "<html>" +
               "<head><style>" +
               "table { font-family: Arial, sans-serif; border-collapse: collapse; width: 50%; margin: 25px 0; }" +
               "td, th { border: 1px solid #dddddd; text-align: left; padding: 12px; }" +
               "tr:nth-child(even) { background-color: #f2f2f2; }" +
               "th { background-color: #04AA6D; color: white; }" +
               "</style></head>" +
               "<body>" +
               "<h2>Información del Laboratorio</h2>" +
               "<table>" +
               "  <tr><th>Campo</th><th>Detalle</th></tr>" +
                "  <tr><td>Grupo</td><td>Cambatec</td></tr>" +
               "  <tr><td>Estudiantes</td><td>Roger Hurtado,Emilio Jimenez,Carlos Eduardo Balcazar,Juan Carlos Guincha,Jhon Lllanos</td></tr>" +
               "  <tr><td>Proyecto</td><td>Laboratorio 3 - Módulo 4</td></tr>" +
               "  <tr><td>Tecnologías</td><td>Spring Boot, Jenkins, GitHub, Linux</td></tr>" +
               "  <tr><td>Puerto</td><td>8085</td></tr>" +
               "  <tr><td>Estado</td><td><b style='color:green;'>Despliegue Exitoso</b></td></tr>" +
               "</table>" +
               "<br><a href='/'>Volver al inicio</a>" +
               "</body></html>";
    }

}