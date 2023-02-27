package br.com.ProjetoLoja.cupom.repository;

import br.com.ProjetoLoja.cupom.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CupomRepository extends JpaRepository<Cupom, Long> {
}
