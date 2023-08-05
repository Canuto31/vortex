package com.test.vortex.mapper;

import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.model.entity.Pedido;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

@Component
public class PedidoMapper implements BaseMapper<OrderDto, Pedido> {
    @Override
    public OrderDto entityToDto(Pedido entity) {
        OrderDto dto = new OrderDto();

        dto.setId(entity.getId());
        dto.setOrderType(entity.getTipoPedido());
        dto.setAddress(entity.getDireccion());
        dto.setIdDriver(entity.getConductorId());

        return dto;
    }

    @Override
    public Pedido dtoToEntity(OrderDto dto) {
        Pedido entity = new Pedido();

        entity.setId(dto.getId());
        entity.setTipoPedido(dto.getOrderType());
        entity.setDireccion(dto.getAddress());
        entity.setConductorId(dto.getIdDriver());

        return entity;
    }

    @Override
    public List<OrderDto> entitiesToDtos(List<Pedido> entities) {
        List<OrderDto> dtos = new ArrayList<>();

        for (Pedido entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<Pedido> DtosToEntities(List<OrderDto> dtos) {
        List<Pedido> entities = new ArrayList<>();

        for (OrderDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
