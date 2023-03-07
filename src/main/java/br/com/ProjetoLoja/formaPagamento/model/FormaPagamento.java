package br.com.ProjetoLoja.formaPagamento.model;

import br.com.ProjetoLoja.enuns.Bandeira;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String NomeCartao;

    @Column
    private String NumeroCartao;

    @Column
    private String CodigoSeguranca;

    private Bandeira bandeira;
}
