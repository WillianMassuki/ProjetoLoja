package br.com.ProjetoLoja.endereco.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String rua;

    @Column
    private Short numero;

    @Column
    private String bairro;

    @Column
    private String cep;

    @Column
    private String complemento;

    @Column
    private String telefone;
}
