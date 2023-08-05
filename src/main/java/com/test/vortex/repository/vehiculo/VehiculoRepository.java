package com.test.vortex.repository.vehiculo;

import com.test.vortex.model.dto.VehicleDto;

import java.util.List;
import java.util.Optional;

public interface VehiculoRepository {

    List<VehicleDto> getAll();
    Optional<VehicleDto> getVehicleById(int idVehicle);
    VehicleDto save(VehicleDto vehicleDto);
    void delete(int idVehicle);
}
