package com.generadorfrasesscreenmatch.repositorio;

import com.generadorfrasesscreenmatch.modelos.Frase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends CrudRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Frase getFraseAleatoria();
}
