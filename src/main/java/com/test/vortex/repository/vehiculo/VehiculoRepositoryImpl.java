package com.test.vortex.repository.vehiculo;

import com.test.vortex.mapper.VehiculoMapper;
import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.model.entity.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

    @Autowired
    private VehiculoCrudRepository crudRepository;
    @Autowired
    private VehiculoMapper mapper;

    @Override
    public List<VehicleDto> getAll() {
        List<Vehiculo> vehicles = (List<Vehiculo>) crudRepository.findAll();
        return mapper.entitiesToDtos(vehicles);
    }

    @Override
    public Optional<List<VehicleDto>> getVehicleByIdDriver(int idDriver) {
        List<Vehiculo> orders = (List<Vehiculo>) crudRepository.findByIdDriverOrderByFirstNameAsc(idDriver);
        return Optional.of(mapper.entitiesToDtos(orders));
    }

    @Override
    public Optional<VehicleDto> getVehicleById(int idVehicle) {
        return crudRepository.findById(idVehicle).map(vehicle -> mapper.entityToDto(vehicle));
    }

    @Override
    public VehicleDto save(VehicleDto vehicleDto) {
        Vehiculo vehiculo = mapper.dtoToEntity(vehicleDto);
        return mapper.entityToDto(crudRepository.save(vehiculo));
    }

    @Override
    public void delete(int idVehicle) {

    }
}
