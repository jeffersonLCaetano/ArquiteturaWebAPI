package com.atividade2.demo.controller;

import com.example.RestAPI.service.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class Controller {
    Service service = new Service();


    @GetMapping(value = "/marcas")
    public String consultarMarcas() {
        return service.consultarMarcas();
    }

    @GetMapping(value = "/modelos/{marca}")
    public String consultarModelos(@PathVariable int marca) {
        return service.consultarModelos(marca);
    }

    @GetMapping(value = "/anos/{marca}/{modelo}")
    public String consultarAnos(@PathVariable int marca, @PathVariable int modelo) {
        return service.consultarAnos(marca, modelo);
    }

    @GetMapping(value = "/valor/{marca}/{modelo}/{ano}")
    public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
        return service.consultarValor(marca, modelo, ano);
    }
}
