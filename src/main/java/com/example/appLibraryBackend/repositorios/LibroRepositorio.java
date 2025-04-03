package com.example.appLibraryBackend.repositorios;

import com.example.appLibraryBackend.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro,Long> {
}
