package com.test.vortex.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VEHICULO")
@Data
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String modelo;

    private String placa;

    private String capacidad;

    @Column(name = "conductor_id")
    private Integer conductorId;

    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;
}
