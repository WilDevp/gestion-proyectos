package com.wildevp.gestionproyectos.service;

import com.wildevp.gestionproyectos.domain.Tarea;
import com.wildevp.gestionproyectos.exceptions.TareaNotFoundException;
import com.wildevp.gestionproyectos.repository.TareaRepository;
import com.wildevp.gestionproyectos.repository.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea actualizarTarea(Tarea tarea) {
        if (!tareaRepository.existsById(tarea.getId())) {
            throw new TareaNotFoundException("La tarea no existe");
        }
        return tareaRepository.save(tarea);
    }

    @Override
    public void eliminarTarea(Long id) {
        if (!tareaRepository.existsById(id)) {
            throw new TareaNotFoundException("La tarea no existe");
        }
        tareaRepository.deleteById(id);
    }

    @Override
    public Tarea obtenerTareaPorId(Long id) {
        Optional<Tarea> tarea = tareaRepository.findById(id);
        if (!tarea.isPresent()) {
            throw new TareaNotFoundException("La tarea no existe");
        }
        return tarea.get();
    }

    @Override
    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }
}
