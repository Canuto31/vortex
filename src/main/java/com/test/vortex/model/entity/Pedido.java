package com.test.vortex.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PEDIDO")
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo_pedido")
    private String tipoPedido;

    private String direccion;

    @Column(name = "conductor_id")
    private Integer conductorId;

    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;
}
