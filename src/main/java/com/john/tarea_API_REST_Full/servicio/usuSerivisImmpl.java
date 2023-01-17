package com.john.tarea_API_REST_Full.servicio;

import com.john.tarea_API_REST_Full.modelo.Usuario;
import com.john.tarea_API_REST_Full.repositoryo.usuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class usuSerivisImmpl implements usuServis{

    @Autowired
    private usuRepository usuReposi;

    @Override
    public List<Usuario> findAll() {
        return usuReposi.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuReposi.save(usuario);
    }

    @Override
    public Usuario findById(Integer id) {
        return usuReposi.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        usuReposi.deleteById(id);


    }
}
