package com.wildevp.gestionproyectos.domain;

import java.time.LocalDateTime;

public class Tarea {
    private long id;
    private String nombre;
    private String descripcion;
    private Enum estado;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaLimite;
    private Proyecto proyecto;
    private Usuario asignadoA;
}
