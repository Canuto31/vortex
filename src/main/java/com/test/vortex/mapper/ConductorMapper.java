package com.test.vortex.mapper;

import com.test.vortex.model.dto.DriverDto;
import com.test.vortex.model.entity.Conductor;
import org.springframework.stereotype.Component;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

@Component
public class ConductorMapper implements BaseMapper<DriverDto, Conductor> {

    @Override
    public DriverDto entityToDto(Conductor entity) {
        DriverDto dto = new DriverDto();

        dto.setId(entity.getId());
        dto.setIdentification(entity.getIdentificacion());
        dto.setLastName(entity.getApellido());
        dto.setFirstName(entity.getNombre());
        dto.setPhoneNumber(entity.getTelefono());
        dto.setAddress(entity.getDireccion());

        return dto;
    }

    @Override
    public Conductor dtoToEntity(DriverDto dto) {
        Conductor entity = new Conductor();

        entity.setId(dto.getId());
        entity.setIdentificacion(dto.getIdentification());
        entity.setApellido(dto.getLastName());
        entity.setNombre(dto.getFirstName());
        entity.setTelefono(dto.getPhoneNumber());
        entity.setDireccion(dto.getAddress());

        return entity;
    }

    @Override
    public List<DriverDto> entitiesToDtos(List<Conductor> entities) {
        List<DriverDto> dtos = new ArrayList<>();

        for (Conductor entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<Conductor> DtosToEntities(List<DriverDto> dtos) {
        List<Conductor> entities = new ArrayList<>();

        for (DriverDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
