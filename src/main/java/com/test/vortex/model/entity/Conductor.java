package com.test.vortex.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "conductor")
@Data
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String identificacion;

    private String apellido;

    private String nombre;

    private String telefono;

    private String direccion;

    @OneToMany(mappedBy = "conductor")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "conductor")
    private List<Vehiculo> vehiculos;
}
