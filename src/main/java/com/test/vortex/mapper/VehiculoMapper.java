package com.test.vortex.mapper;

import com.test.vortex.model.dto.OrderDto;
import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.model.entity.Conductor;
import com.test.vortex.model.entity.Pedido;
import com.test.vortex.model.entity.Vehiculo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehiculoMapper implements BaseMapper<VehicleDto, Vehiculo>{
    @Override
    public VehicleDto entityToDto(Vehiculo entity) {
        VehicleDto dto = new VehicleDto();

        dto.setId(entity.getId());
        dto.setModel(entity.getModelo());
        dto.setPlate(entity.getPlaca());
        dto.setCapacity(entity.getCapacidad());
        dto.setIdDriver(entity.getConductorId());

        return dto;
    }

    @Override
    public Vehiculo dtoToEntity(VehicleDto dto) {
        Vehiculo entity = new Vehiculo();

        entity.setId(dto.getId());
        entity.setModelo(dto.getModel());
        entity.setPlaca(dto.getPlate());
        entity.setCapacidad(dto.getCapacity());
        entity.setConductorId(dto.getIdDriver());
        /*Conductor conductor = new Conductor();
        conductor.setId(dto.getIdDriver());
        entity.setConductor(conductor);*/

        return entity;
    }

    @Override
    public List<VehicleDto> entitiesToDtos(List<Vehiculo> entities) {
        List<VehicleDto> dtos = new ArrayList<>();

        for (Vehiculo entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<Vehiculo> DtosToEntities(List<VehicleDto> dtos) {
        List<Vehiculo> entities = new ArrayList<>();

        for (VehicleDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
