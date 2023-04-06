package com.wildevp.gestionproyectos.repository;

import com.wildevp.gestionproyectos.domain.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository  extends JpaRepository<Proyecto, Long> {
    boolean existsByNombre(String nombre);
}
