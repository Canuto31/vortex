package com.test.vortex.service.pedido;

import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.repository.pedido.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository repository;

    @Override
    public List<OrderDto> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<List<OrderDto>> getOrderByIdDriver(int idDriver) {
        return repository.getOrderByIdDriver(idDriver);
    }

    @Override
    public Optional<OrderDto> getOrderById(int idOrder) {
        return repository.getOrderById(idOrder);
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        return repository.save(orderDto);
    }

    @Override
    public Boolean delete(int idOrder) {
        return getOrderById(idOrder).map(order -> {
            repository.delete(idOrder);
            return true;
        }).orElse(false);
    }
}
