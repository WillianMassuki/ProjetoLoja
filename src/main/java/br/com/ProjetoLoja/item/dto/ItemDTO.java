package br.com.ProjetoLoja.item.dto;

import br.com.ProjetoLoja.produto.model.Produto;
import br.com.ProjetoLoja.venda.model.Venda;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ItemDTO {

    @NotNull
    private Long id;

    @NotNull
    private Short quantidade;

    @NotNull
    private BigDecimal precoParcial;

    @NotNull
    private Produto produto;

    @NotNull
    private Venda venda;
}
