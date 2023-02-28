package br.com.ProjetoLoja.endereco.repository;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.endereco.model.Endereco;
import br.com.ProjetoLoja.endereco.vo.EnderecoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {


    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.endereco.vo.EnderecoVO( " +
                    " endereco.id, " +
                    " endereco.rua, " +
                    " endereco.numero, " +
                    " endereco.bairro, " +
                    " endereco.cep, " +
                    " endereco.complemento," +
                    " endereco.telefone " +
                    ") " +
                    " FROM " +
                    " Endereco endereco"

    )
    List<EnderecoVO> findAllBy();

    @Query(
            " SELECT " +
                    " new br.com.ProjetoLoja.endereco.vo.EnderecoVO( " +
                    " endereco.id, " +
                    " endereco.rua, " +
                    " endereco.numero, " +
                    " endereco.bairro, " +
                    " endereco.cep, " +
                    " endereco.complemento," +
                    " endereco.telefone " +
                    ") " +
                    " FROM " +
                    " Endereco endereco" +
                    " WHERE " +
                    "endereco.id = :IdEndereco"

    )
    List<EnderecoVO> findByOne(@Param("IdEndereco") Long IdEndereco );

}
