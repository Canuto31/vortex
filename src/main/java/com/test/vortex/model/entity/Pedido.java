package com.test.vortex.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pedido")
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo_pedido")
    private String tipoPedido;

    private String direccion;

    @Column(name = "conductor_id")
    private Integer conductorId;

    @ManyToOne
    @JoinColumn(name = "conductor_id", insertable = false, updatable = false)
    private Conductor conductor;
}
