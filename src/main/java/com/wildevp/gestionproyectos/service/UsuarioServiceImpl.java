package com.wildevp.gestionproyectos.service;

import com.wildevp.gestionproyectos.domain.Usuario;
import com.wildevp.gestionproyectos.exceptions.UsuarioEmailExistenteException;
import com.wildevp.gestionproyectos.exceptions.UsuarioNombreExistenteException;
import com.wildevp.gestionproyectos.exceptions.UsuarioNotFoundException;
import com.wildevp.gestionproyectos.repository.UsuarioRepository;
import com.wildevp.gestionproyectos.repository.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new UsuarioEmailExistenteException("El correo electrónico ya está en uso");
        }

        if (usuarioRepository.existsByUsername(usuario.getNombreUsuario())) {
            throw new UsuarioNombreExistenteException("El nombre de usuario ya está en uso");
        }

        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        if (!usuarioRepository.existsById(usuario.getId())) {
            throw new UsuarioNotFoundException("El usuario no existe");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new UsuarioNotFoundException("El usuario no existe");
        }
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (!usuario.isPresent()) {
            throw new UsuarioNotFoundException("El usuario no existe");
        }
        return usuario.get();
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
