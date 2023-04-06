package com.wildevp.gestionproyectos.repository;

import com.wildevp.gestionproyectos.domain.Tarea;

import java.util.List;

public interface TareaService {
    Tarea crearTarea(Tarea tarea);
    Tarea actualizarTarea(Tarea tarea);
    void eliminarTarea(Long id);
    Tarea obtenerTareaPorId(Long id);
    List<Tarea> listarTareas();
}
