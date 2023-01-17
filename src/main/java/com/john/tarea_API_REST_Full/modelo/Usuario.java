package com.john.tarea_API_REST_Full.modelo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id_user;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "clave")
    private String clave;
    @Column(name = "email")
    private String email;
    @Column(name = "estado")
    private Boolean estado;
}
