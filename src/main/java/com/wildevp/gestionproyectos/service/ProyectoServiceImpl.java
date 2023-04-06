package com.wildevp.gestionproyectos.service;

import com.wildevp.gestionproyectos.domain.Proyecto;
import com.wildevp.gestionproyectos.exceptions.NombreProyectoDuplicadoException;
import com.wildevp.gestionproyectos.repository.ProyectoRepository;
import com.wildevp.gestionproyectos.repository.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoServiceImpl implements ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public Proyecto crearProyecto(Proyecto proyecto){
        if (proyectoRepository.existsByNombre(proyecto.getNombre())){
            throw new NombreProyectoDuplicadoException("El nombre del proyecto ya existe");
        }
        return proyectoRepository.save(proyecto);
        }
    @Override
    public Proyecto actualizarProyecto(Proyecto proyecto) {
        if (!proyectoRepository.existsById(proyecto.getId())) {
            throw new IllegalStateException("El proyecto no existe");
        }
        return proyectoRepository.save(proyecto);
    }
    @Override
    public void eliminarProyecto(Long id) {
        if (!proyectoRepository.existsById(id)) {
            throw new IllegalStateException("El proyecto no existe");
        }
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyectoPorId(Long id) {
        Optional<Proyecto> proyecto = proyectoRepository.findById(id);
        if (!proyecto.isPresent()) {
            throw new IllegalStateException("El proyecto no existe");
        }
        return proyecto.get();
    }
    @Override
    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }
}
