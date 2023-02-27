package br.com.ProjetoLoja.cupomProduto.repository;

import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CupomProdutoRepository extends JpaRepository<CupomProduto, Long> {
}
