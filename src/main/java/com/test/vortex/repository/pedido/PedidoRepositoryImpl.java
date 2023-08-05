package com.test.vortex.repository.pedido;

import com.test.vortex.mapper.PedidoMapper;
import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.model.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository{

    @Autowired
    private PedidoCrudRepository crudRepository;
    @Autowired
    private PedidoMapper mapper;

    @Override
    public List<OrderDto> getAll() {
        List<Pedido> orders = (List<Pedido>) crudRepository.findAll();
        return mapper.entitiesToDtos(orders);
    }

    @Override
    public Optional<List<OrderDto>> getOrderByIdDriver(int idDriver) {
        List<Pedido> orders = (List<Pedido>) crudRepository.findByIdDriverOrderByFirstNameAsc(idDriver);
        return Optional.of(mapper.entitiesToDtos(orders));
    }

    @Override
    public Optional<OrderDto> getOrderById(int idOrder) {
        return Optional.empty();
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        return null;
    }

    @Override
    public void delete(int idOrder) {

    }
}
