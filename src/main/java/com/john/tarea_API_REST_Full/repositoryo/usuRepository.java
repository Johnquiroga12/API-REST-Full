package com.john.tarea_API_REST_Full.repositoryo;

import com.john.tarea_API_REST_Full.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuRepository extends JpaRepository<Usuario, Integer> {
}
