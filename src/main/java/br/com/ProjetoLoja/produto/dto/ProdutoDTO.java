package br.com.ProjetoLoja.produto.dto;

import br.com.ProjetoLoja.enuns.Fabricante;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ProdutoDTO {

    @NotNull
    private Long id;

    @NotNull
    @Length(max = 100)
    private String descricao;

    @Length(max = 100)
    private Short quantidade;

    @NotNull
    private BigDecimal preco;


    @NotNull
    private Fabricante fabricante;
}
