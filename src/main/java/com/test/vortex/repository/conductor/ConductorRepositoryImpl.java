package com.test.vortex.repository.conductor;

import com.test.vortex.mapper.ConductorMapper;
import com.test.vortex.model.dto.DriverDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ConductorRepositoryImpl implements ConductorRepository{

    @Autowired
    private ConductorCrudRepository crudRepository;
    @Autowired
    private ConductorMapper mapper;

    @Override
    public List<DriverDto> getAll() {
        return null;
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
    public void delete(int idDriver) {

    }
}
