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
    @Column(name = "id_cupom")
    private Long id;

    @Column(nullable = false)
    private String codigoCupom;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Venda pedido;

    @Column
    private String motivo;

    @Column
    private LocalDateTime dataCriacao;

    @Column
    private LocalDateTime dataAtualizacao;

    @Column
    private Boolean aprovado;

}
