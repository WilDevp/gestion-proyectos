package com.wildevp.gestionproyectos.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
