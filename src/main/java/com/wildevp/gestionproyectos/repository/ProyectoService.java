package com.wildevp.gestionproyectos.repository;

import com.wildevp.gestionproyectos.domain.Proyecto;

import java.util.List;

public interface ProyectoService {
    Proyecto crearProyecto(Proyecto proyecto);
    Proyecto actualizarProyecto(Proyecto proyecto);
    void eliminarProyecto(Long id);
    Proyecto obtenerProyectoPorId(Long id);
    List<Proyecto> listarProyectos();
}
