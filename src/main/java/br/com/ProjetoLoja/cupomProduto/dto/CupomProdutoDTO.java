package br.com.ProjetoLoja.cupomProduto.dto;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CupomProdutoDTO {

    @NotNull
    private Long id;

    @NotNull
    private Produto produto;

    @NotNull
    private Cupom cupom;

    @NotNull
    private int quantidade;

    @NotNull
    private BigDecimal precoparcial;

    @NotNull
    private LocalDateTime DataCriacao;

    @NotNull
    private LocalDateTime dataAtualizacao;
}
