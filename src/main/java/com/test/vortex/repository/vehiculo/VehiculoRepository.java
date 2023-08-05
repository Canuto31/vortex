package com.test.vortex.repository.vehiculo;

import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.model.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface VehiculoRepository {

    List<VehicleDto> getAll();

    Optional<List<Pedido>> getOrderByIdDriver(int idDriver);
    Optional<VehicleDto> getVehicleById(int idVehicle);
    VehicleDto save(VehicleDto vehicleDto);
    void delete(int idVehicle);
}
