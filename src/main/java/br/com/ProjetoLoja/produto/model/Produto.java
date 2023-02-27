package br.com.ProjetoLoja.produto.model;

import br.com.ProjetoLoja.enuns.Fabricante;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column
    private Short quantidade;

    @Column
    private BigDecimal preco;


    @Column
    private Fabricante fabricante;
}
