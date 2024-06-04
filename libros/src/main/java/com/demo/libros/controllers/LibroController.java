package com.demo.libros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.libros.models.Libro;
//import com.demo.libros.repositories.LibroRepositoryImpl;
import com.demo.libros.services.LibroService;
import org.springframework.web.bind.annotation.PostMapping;
import com.demo.libros.utils.LibroException;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    @GetMapping("/libros/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);

        if (libro == null) {
            throw new LibroException("No existe libro con el id " + id);
        }
        return ResponseEntity.ok(libro);
    }

    @PostMapping("/libros")
    public ResponseEntity<Libro> nuevLibro(@RequestBody Libro libro) {
        var new_libro = libroService.nuevLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new_libro);
    }  

}