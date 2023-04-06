package com.wildevp.gestionproyectos.repository;

import com.wildevp.gestionproyectos.domain.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
