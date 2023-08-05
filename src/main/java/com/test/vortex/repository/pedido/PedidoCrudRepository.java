package com.test.vortex.repository.pedido;

import com.test.vortex.model.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {

    List<Pedido> findByIdDriverOrderByFirstNameAsc(int idDriver);
}
