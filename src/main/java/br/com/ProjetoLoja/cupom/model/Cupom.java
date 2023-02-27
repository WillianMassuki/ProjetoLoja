package br.com.ProjetoLoja.cupom.model;

import br.com.ProjetoLoja.venda.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String CodigoCupom;

    @OneToOne
    private Venda pedido;
    private String motivo;

    @Column
    private LocalDateTime DataCriacao;

    @Column
    private LocalDateTime dataAtualizacao;

    @Column
    private boolean aprovado;

}
