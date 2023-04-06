package com.wildevp.gestionproyectos.repository;

import com.wildevp.gestionproyectos.domain.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
    Usuario obtenerUsuarioPorId(Long id);
    List<Usuario> listarUsuarios();
}
