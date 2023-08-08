package com.test.vortex.repository.vehiculo;

import com.test.vortex.model.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface VehiculoCrudRepository extends CrudRepository<Vehiculo, Integer> {

    List<Vehiculo> findByConductorId(int idDriver);
}
