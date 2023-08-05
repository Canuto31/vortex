package com.test.vortex.repository.pedido;

import com.test.vortex.model.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {

    Optional<List<Pedido>> findByIdDriverOrderByFirstNameAsc(int idDriver);
}
