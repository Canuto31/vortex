package com.test.vortex.service.vehiculo;

import com.test.vortex.model.dto.VehicleDto;

import java.util.List;
import java.util.Optional;

public interface VehiculoService {

    List<VehicleDto> getAll();
    Optional<List<VehicleDto>> getVehicleByIdDriver(int idVehicle);
    Optional<VehicleDto> getVehicleById(int idVehicle);
    VehicleDto save(VehicleDto vehicleDto);
    Boolean delete(int idVehicle);
}
