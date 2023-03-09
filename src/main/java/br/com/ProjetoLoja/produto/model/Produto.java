package br.com.ProjetoLoja.produto.model;

import br.com.ProjetoLoja.enuns.Fabricante;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
@Entity
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

    @Enumerated(EnumType.STRING)
    @Column
    private Fabricante fabricante;
}
