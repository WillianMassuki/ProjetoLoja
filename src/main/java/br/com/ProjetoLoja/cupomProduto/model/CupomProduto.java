package br.com.ProjetoLoja.cupomProduto.model;

import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CupomProduto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Produto produto;

    @OneToOne(fetch = FetchType.LAZY)
    private Cupom cupom;

    @Column
    private Integer quantidade;

    @Column
    private BigDecimal precoparcial;

    @Column
    private LocalDateTime DataCriacao;

    @Column
    private LocalDateTime dataAtualizacao;
}
