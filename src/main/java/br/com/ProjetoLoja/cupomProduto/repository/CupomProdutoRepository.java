package br.com.ProjetoLoja.cupomProduto.repository;

import br.com.ProjetoLoja.cupom.vo.CupomVO;
import br.com.ProjetoLoja.cupomProduto.model.CupomProduto;
import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CupomProdutoRepository extends JpaRepository<CupomProduto, Long> {

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO( " +
                    " cupomproduto.id, " +
                    " produto.descricao, " +
                    " cupom.codigoCupom, " +
                    " cupomproduto.quantidade, " +
                    " cupomproduto.precoparcial, " +
                    " cupomproduto.dataCriacao," +
                    " cupomproduto.dataAtualizacao " +
                    ") " +
                    " FROM " +
                    " CupomProduto cupomproduto " +
                    " JOIN " +
                    " cupomproduto.produto produto " +
                    " JOIN " +
                    " cupomproduto.cupom cupom "

    )
    List<CupomProdutoVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO( " +
                    " cupomproduto.id, " +
                    " produto.descricao, " +
                    " cupom.codigoCupom, " +
                    " cupomproduto.quantidade, " +
                    " cupomproduto.precoparcial, " +
                    " cupomproduto.dataCriacao," +
                    " cupomproduto.dataAtualizacao " +
                    ") " +
                    " FROM " +
                    " CupomProduto cupomproduto " +
                    " JOIN " +
                    " cupomproduto.produto produto " +
                    " JOIN " +
                    " cupomproduto.cupom cupom " +
                    "WHERE " +
                    "cupomproduto.id = :idCupomProduto"

    )
    Optional<CupomProdutoVO> findByOne(@Param("idCupomProduto") Long idCupomProduto);
}
