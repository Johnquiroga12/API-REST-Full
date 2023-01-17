package com.john.tarea_API_REST_Full.controlador;


import com.john.tarea_API_REST_Full.modelo.Usuario;
import com.john.tarea_API_REST_Full.servicio.usuServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")

public class usuControl {

    @Autowired
    private usuServis userService;

    @GetMapping("/usu/listar")
    public ResponseEntity<List<Usuario>> getAll(){
            return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/usu/buscar/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable("id") Integer id){
      return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("/usu/guardar")
    public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario){

            return new ResponseEntity<>(userService.save(usuario), HttpStatus.CREATED);

    }

    @DeleteMapping("/usu/borrar/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id){
            userService.delete(id);
            return new ResponseEntity<>("el usurio se a eliminado", HttpStatus.NO_CONTENT);

    }

    @PutMapping("/usu/editar/{id}")
    public ResponseEntity<?> updateUser(@RequestBody Usuario usuario, @PathVariable("id") Integer id){
        Usuario usuarioUp = userService.findById(id);
            if(usuarioUp == null){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }else{
                usuarioUp.setNombre(usuario.getNombre());
                usuarioUp.setClave(usuario.getClave());
                usuarioUp.setEmail(usuario.getEmail());
                usuarioUp.setEstado(usuario.getEstado());
                return new ResponseEntity<>(userService.save(usuarioUp), HttpStatus.CREATED);
            }
    }
}
