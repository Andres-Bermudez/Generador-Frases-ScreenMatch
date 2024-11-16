package com.generadorfrasesscreenmatch.controladores;

import com.generadorfrasesscreenmatch.dto.FraseDTO;
import com.generadorfrasesscreenmatch.servicios.FraseServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesControlador {

    @Autowired
    FraseServicio servicio;

    @GetMapping("/frases")
    public FraseDTO getFraseAleatoria() {
        return servicio.getFraseAleatoria();
    }
}
