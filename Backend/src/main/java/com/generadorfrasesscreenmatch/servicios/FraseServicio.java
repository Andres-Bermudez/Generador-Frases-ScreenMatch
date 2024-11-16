package com.generadorfrasesscreenmatch.servicios;

import com.generadorfrasesscreenmatch.dto.FraseDTO;
import com.generadorfrasesscreenmatch.modelos.Frase;
import com.generadorfrasesscreenmatch.repositorio.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServicio {
    
    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO getFraseAleatoria() {
        Frase frase = fraseRepository.getFraseAleatoria();
        return new FraseDTO(frase.getTituloSerie(),
                frase.getFrase(), frase.getImagen(), frase.getAutor());
    }
}
