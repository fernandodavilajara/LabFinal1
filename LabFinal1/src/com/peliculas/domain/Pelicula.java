package com.peliculas.domain;

import java.io.Serializable;

/**
 *
 * @author Fernando Davila
 */
public class Pelicula implements Serializable {
    private String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
