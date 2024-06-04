package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryDemo implements LibroRepository {

    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryDemo() {
        libros.add(new Libro(1, "El imperio final", "Brandon Sanderson", "Penguin Random House", 2006));
        libros.add(new Libro(2, "El museo", "Owen King", "PLAZA & JANES", 2024));
        libros.add(new Libro(3, "Seis grullas", "Elizabeth lim", "Minotauro", 2023));
        libros.add(new Libro(4, "Circe", "Madeline Miller", "adnovels", 2018));
        libros.add(new Libro(5, "Las aventuras de Tintín", "Georges Remi ", " Le Petit Vingtième, Le Soir,", 1976));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectado a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectado a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
