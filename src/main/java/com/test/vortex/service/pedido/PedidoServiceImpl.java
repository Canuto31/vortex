package com.test.vortex.service.pedido;

import com.test.vortex.model.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Override
    public List<OrderDto> getAll() {
        return null;
    }

    @Override
    public Optional<List<OrderDto>> getOrderByIdDriver(int idOrder) {
        return Optional.empty();
    }

    @Override
    public Optional<OrderDto> getOrderById(int irOrder) {
        return Optional.empty();
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        return null;
    }

    @Override
    public Boolean delete(int idOrder) {
        return null;
    }
}
