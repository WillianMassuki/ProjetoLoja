package br.com.ProjetoLoja.produto.repository;

import br.com.ProjetoLoja.produto.model.Produto;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.produto.vo.ProdutoVO( " +
                    " produto.id, " +
                    " produto.descricao, " +
                    " produto.quantidade, " +
                    " produto.preco " +
                    " produto.fabricante " +
                    ") " +
                    " FROM " +
                    " Produto produto "
    )
    List<ProdutoVO> findAllByProduto();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.produto.vo.ProdutoVO( " +
                    " produto.id, " +
                    " produto.descricao, " +
                    " produto.quantidade, " +
                    " produto.preco " +
                    " produto.fabricante " +
                    ") " +
                    " FROM " +
                    " Produto produto " +
                    " WHERE " +
                    " produto.id = :idProduto "
    )
    List<ProdutoVO> findByOne(@Param("idProduto") Long idProduto);

    @Query( "SELECT " +
            " produto.id " +
            " FROM " +
            " Produto produto " +
            " WHERE " +
            " produto.id = :idProduto "

    )
    Optional<Long> findIdBy( @Param("idProduto") Long idProduto) ;


}
