package com.test.vortex.repository.pedido;

import com.test.vortex.model.dto.OrderDto;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository {

    List<OrderDto> getAll();
    Optional<OrderDto> getOrderById(int idOrder);
    OrderDto save(OrderDto orderDto);
    void delete(int idOrder);
}
