package com.john.tarea_API_REST_Full.servicio;

import com.john.tarea_API_REST_Full.modelo.Usuario;

import java.util.List;

public interface usuServis {
    public List<Usuario> findAll();

    public Usuario save(Usuario usuario);

    public Usuario findById(Integer id);

    public void delete(Integer id);

}
