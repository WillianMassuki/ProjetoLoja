package br.com.ProjetoLoja.produto.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ProdutoVO {

    private final Long id;

    private final String descricao;

    private  final Short quantidade;


    private final BigDecimal preco;

}
