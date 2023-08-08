package com.test.vortex.controller;

import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping()
    public ResponseEntity<List<OrderDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
