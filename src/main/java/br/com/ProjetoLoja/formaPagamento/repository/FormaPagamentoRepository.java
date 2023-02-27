package br.com.ProjetoLoja.formaPagamento.repository;

import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {
}
