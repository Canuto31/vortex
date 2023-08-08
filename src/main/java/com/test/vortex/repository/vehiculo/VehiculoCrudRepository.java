package com.test.vortex.repository.vehiculo;

import com.test.vortex.model.entity.Vehiculo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface VehiculoCrudRepository extends CrudRepository<Vehiculo, Integer> {

    List<Vehiculo> findByConductorId(int idDriver);

    @Transactional
    @Modifying
    @Query("UPDATE Vehiculo v SET v.conductor.id = :idDriver WHERE v.id = :idVehicle AND v.conductor IS NULL")
    void assignConductorToUnassignedVehicle(int idVehicle, int idDriver);

    @Modifying
    @Transactional
    @Query("UPDATE Vehiculo v SET v.conductor = null WHERE v.id = :idVehicle")
    void removeConductorFromVehicle(int idVehicle);
}
