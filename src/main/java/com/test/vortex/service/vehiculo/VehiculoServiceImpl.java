package com.test.vortex.service.vehiculo;

import com.test.vortex.model.dto.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements VehiculoService{
    @Override
    public List<VehicleDto> getAll() {
        return null;
    }

    @Override
    public Optional<List<VehicleDto>> getVehicleByIdDriver(int idVehicle) {
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
    public Boolean delete(int idVehicle) {
        return null;
    }
}
