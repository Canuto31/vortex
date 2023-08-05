package com.test.vortex.repository.conductor;

import com.test.vortex.model.entity.Conductor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConductorCrudRepository extends CrudRepository<Conductor, Integer> {

    List<Conductor> findByIdentificacion(int identification);
}
