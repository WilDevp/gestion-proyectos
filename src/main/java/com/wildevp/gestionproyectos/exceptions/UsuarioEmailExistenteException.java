package com.wildevp.gestionproyectos.exceptions;

public class UsuarioEmailExistenteException extends RuntimeException{
    public UsuarioEmailExistenteException(String message) {
        super(message);
    }
}
