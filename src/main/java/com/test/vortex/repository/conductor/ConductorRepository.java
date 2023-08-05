package com.test.vortex.repository.conductor;

import com.test.vortex.model.dto.DriverDto;

import java.util.List;
import java.util.Optional;

public interface ConductorRepository {

    List<DriverDto> getAll();

    Optional<DriverDto> getDriverByIdentification(int idIdentification);
    Optional<DriverDto> getDriverById(int idDriver);
    DriverDto save(DriverDto driverDto);
    void delete(int idDriver);
}
