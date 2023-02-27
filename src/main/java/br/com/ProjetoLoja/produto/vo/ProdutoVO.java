package br.com.ProjetoLoja.produto.vo;

import br.com.ProjetoLoja.enuns.Fabricante;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class ProdutoVO {

    private final Long id;

    private final String descricao;

    private  final Short quantidade;

    private final BigDecimal preco;

    private final Fabricante fabricante;
}
