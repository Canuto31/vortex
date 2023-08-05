package com.test.vortex.repository.vehiculo;

import com.test.vortex.model.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculoCrudRepository extends CrudRepository<Vehiculo, Integer> {

    List<Vehiculo> findByIdDriverOrderByFirstNameAsc(int idDriver);
}
