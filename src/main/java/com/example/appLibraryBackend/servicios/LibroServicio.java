package com.example.appLibraryBackend.servicios;

import com.example.appLibraryBackend.modelos.Libro;
import com.example.appLibraryBackend.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    //Instanciar el repositorio del libro
    @Autowired //Anotación que permite inyectar objetos en esta clase. (repositorio respectivo)
    private LibroRepositorio libroRepositorio;
    //Método constructor de este servicio/atributo

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public Libro saveLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    //Método para listar todos los libros
    public List<Libro> getAllLibros(){
        return libroRepositorio.findAll();
    }
}
