package br.com.ProjetoLoja.produto.repository;

import br.com.ProjetoLoja.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
