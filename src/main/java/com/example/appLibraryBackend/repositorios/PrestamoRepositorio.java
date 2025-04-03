package com.example.appLibraryBackend.repositorios;

import com.example.appLibraryBackend.modelos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
}
