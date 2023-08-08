package com.test.vortex.service.conductor;

import com.test.vortex.model.dto.DriverDto;

import java.util.List;
import java.util.Optional;

public interface ConductorService {

    List<DriverDto> getAll();
    Optional<DriverDto> getDriverByIdentification(int identification);
    Optional<DriverDto> getDriverById(int idDriver);
    DriverDto save(DriverDto driverDto);
    Boolean delete(int idDriver);
}
