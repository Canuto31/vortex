package com.test.vortex.repository.vehiculo;

import com.test.vortex.mapper.VehiculoMapper;
import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.model.entity.Pedido;
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
        return null;
    }

    @Override
    public Optional<List<Pedido>> getOrderByIdDriver(int idDriver) {
        return Optional.empty();
    }

    @Override
    public Optional<VehicleDto> getVehicleById(int idVehicle) {
        return Optional.empty();
    }

    @Override
    public VehicleDto save(VehicleDto vehicleDto) {
        return null;
    }

    @Override
    public void delete(int idVehicle) {

    }
}
