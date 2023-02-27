package br.com.ProjetoLoja.cupomProduto.vo;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CupomProdutoVO {

    private final Long id;

    private final Produto produto;

    private Cupom cupom;

    private final int quantidade;

    private final BigDecimal precoparcial;

    private  final LocalDateTime DataCriacao;

    private final LocalDateTime dataAtualizacao;
}
