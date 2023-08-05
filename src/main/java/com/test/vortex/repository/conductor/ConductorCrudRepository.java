package com.test.vortex.repository.conductor;

import com.test.vortex.model.entity.Conductor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ConductorCrudRepository extends CrudRepository<Conductor, Integer> {

    Optional<Conductor> findByIdentificacion(int identification);
}
