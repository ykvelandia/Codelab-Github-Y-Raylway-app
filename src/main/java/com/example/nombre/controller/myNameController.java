package com.example.nombre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myNameController {

    @GetMapping("/name")
    public String obtenerNombre(){
        return "Yeni Karina Velandia Cruz 🤗";
    }


}
