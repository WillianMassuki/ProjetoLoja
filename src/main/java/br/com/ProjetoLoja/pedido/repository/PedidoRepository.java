package br.com.ProjetoLoja.pedido.repository;

import br.com.ProjetoLoja.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
