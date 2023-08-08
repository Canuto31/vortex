package com.test.vortex.controller;

import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping()
    public ResponseEntity<List<OrderDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/driver/{id}")
    public ResponseEntity<List<OrderDto>> getOrderByIdDriver(@PathVariable("id") int idDriver) {
        return service.getOrderByIdDriver(idDriver).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable("id") int idOrder) {
        return service.getOrderById(idOrder).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<OrderDto> saveDriver(@RequestBody OrderDto orderDto) {
        return new ResponseEntity<>(service.save(orderDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDriver(@PathVariable("id") int idOrder) {
        return new ResponseEntity<>(service.delete(idOrder) ? "Deleted successfully" : "Not found",
                this.service.delete(idOrder) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
