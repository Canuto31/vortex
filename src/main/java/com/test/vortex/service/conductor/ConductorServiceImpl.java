package com.test.vortex.service.conductor;

import com.test.vortex.model.dto.DriverDto;
import com.test.vortex.repository.conductor.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorServiceImpl implements ConductorService{

    @Autowired
    private ConductorRepository repository;
    @Override
    public List<DriverDto> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<DriverDto> getDriverByIdentification(String identification) {
        return repository.getDriverByIdentification(identification);
    }

    @Override
    public Optional<DriverDto> getDriverById(int idDriver) {
        return repository.getDriverById(idDriver);
    }

    @Override
    public DriverDto save(DriverDto driverDto) {
        return repository.save(driverDto);
    }

    @Override
    public Boolean delete(int idDriver) {
        return getDriverById(idDriver).map(driver -> {
            repository.delete(idDriver);
            return true;
        }).orElse(false);
    }
}
