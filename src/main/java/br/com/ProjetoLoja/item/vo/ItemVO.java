package br.com.ProjetoLoja.item.vo;

import br.com.ProjetoLoja.produto.model.Produto;
import br.com.ProjetoLoja.venda.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItemVO {


    private final Long id;

    private final Short quantidade;

    private final BigDecimal precoParcial;


    private final Produto produto;

    private final Venda venda;
}
