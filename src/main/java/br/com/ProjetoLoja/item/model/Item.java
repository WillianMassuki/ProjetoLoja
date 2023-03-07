package br.com.ProjetoLoja.item.model;

import br.com.ProjetoLoja.produto.model.Produto;
import br.com.ProjetoLoja.venda.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Short quantidade;

    @Column
    private BigDecimal precoParcial;

    @ManyToOne
    @JoinColumn
    private Produto produto;

    @ManyToOne
    @JoinColumn
    private Venda venda;

}
