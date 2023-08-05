package com.test.vortex.repository.conductor;

import com.test.vortex.model.dto.DriverDto;

import java.util.List;
import java.util.Optional;

public interface ConductorRepository {

    List<DriverDto> getAll();
    Optional<DriverDto> getDriverById(int idBook);
    DriverDto save(DriverDto bookDto);
    void delete(int idBook);
}
