package com.test.vortex.service.pedido;

import com.test.vortex.model.dto.OrderDto;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<OrderDto> getAll();
    Optional<List<OrderDto>> getOrderByIdDriver(int idOrder);
    Optional<OrderDto> getOrderById(int irOrder);
    OrderDto save(OrderDto orderDto);
    Boolean delete(int idOrder);
}
