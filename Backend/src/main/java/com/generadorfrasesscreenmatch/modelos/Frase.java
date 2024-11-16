package com.generadorfrasesscreenmatch.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "frases_populares")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String tituloSerie;

    @Column(nullable = false)
    private String imagen;

    @Column(nullable = false)
    private String frase;

    @Column(nullable = false)
    private String autor;

    public Frase(String tituloSerie, String imagen, String frase, String autor) {
        this.tituloSerie = tituloSerie;
        this.imagen = imagen;
        this.frase = frase;
        this.autor = autor;
    }

    public Frase() {

    }

    @Override
    public String toString() {
        return "\nFrase: " +
                "\nTitulo de la serie: " + tituloSerie +
                "\nImagen: " + imagen +
                "\nTexto: " + frase +
                "\nAutor: " + autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFrase() {
        return frase;
    }

    public void setTexto(String frase) {
        this.frase = frase;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
