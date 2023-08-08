package com.test.vortex.service.vehiculo;

import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.repository.vehiculo.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository repository;

    @Override
    public List<VehicleDto> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<List<VehicleDto>> getVehicleByIdDriver(int idVehicle) {
        return repository.getVehicleByIdDriver(idVehicle);
    }

    @Override
    public Optional<VehicleDto> getVehicleById(int idVehicle) {
        return repository.getVehicleById(idVehicle);
    }

    @Override
    public VehicleDto save(VehicleDto vehicleDto) {
        return repository.save(vehicleDto);
    }

    @Override
    public Boolean delete(int idVehicle) {
        return getVehicleById(idVehicle).map(vehicle -> {
            repository.delete(idVehicle);
            return true;
        }).orElse(false);
    }
}
