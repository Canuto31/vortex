package com.test.vortex.service.conductor;

import com.test.vortex.model.dto.DriverDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorServiceImpl implements ConductorService{
    @Override
    public List<DriverDto> getAll() {
        return null;
    }

    @Override
    public Optional<DriverDto> getDriverByIdentification(int identification) {
        return Optional.empty();
    }

    @Override
    public Optional<DriverDto> getDriverById(int idDriver) {
        return Optional.empty();
    }

    @Override
    public DriverDto save(DriverDto driverDto) {
        return null;
    }

    @Override
    public Boolean delete(int idDriver) {
        return null;
    }
}
