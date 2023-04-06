package com.wildevp.gestionproyectos.exceptions;

public class TareaNotFoundException extends RuntimeException{
    public TareaNotFoundException(String message) {
        super(message);
    }
}
