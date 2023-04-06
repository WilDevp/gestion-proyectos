package com.wildevp.gestionproyectos.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Proyecto {
    private long id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private List<Tarea> tareas;
    private Usuario usuario;
}
