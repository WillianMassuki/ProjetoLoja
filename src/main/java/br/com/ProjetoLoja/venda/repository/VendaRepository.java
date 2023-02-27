package br.com.ProjetoLoja.venda.repository;

import br.com.ProjetoLoja.venda.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository  extends JpaRepository<Venda, Long> {
}
