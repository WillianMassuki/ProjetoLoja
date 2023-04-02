package br.com.ProjetoLoja.produto.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class AlteracaoProdutoDTO {

    @NotNull
    @Length(max = 100)
    private String descricao;

    @Length(max = 100)
    private Short quantidade;

    @NotNull
    private BigDecimal preco;

}
