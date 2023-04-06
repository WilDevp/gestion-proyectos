package com.wildevp.gestionproyectos.domain;

import java.util.List;

public class Usuario {
    private Long id;
    private String nombreUsuario;
    private String email;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private Enum rol;
    private List<Proyecto> proyectos;
    private List<Tarea> tareasAsignadas;

}
