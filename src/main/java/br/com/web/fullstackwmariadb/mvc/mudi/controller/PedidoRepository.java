package br.com.web.fullstackwmariadb.mvc.mudi.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.web.fullstackwmariadb.mvc.mudi.model.Pedido;
import br.com.web.fullstackwmariadb.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);

}
