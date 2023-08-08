package com.test.vortex.service.pedido;

import com.test.vortex.model.dto.OrderDto;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<OrderDto> getAll();
    Optional<List<OrderDto>> getOrderByIdDriver(int idDriver);
    Optional<OrderDto> getOrderById(int idOrder);
    OrderDto save(OrderDto orderDto);
    Boolean delete(int idOrder);
}
