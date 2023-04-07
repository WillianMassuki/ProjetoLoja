package br.com.ProjetoLoja.formaPagamento.factory;

import br.com.ProjetoLoja.cupom.dto.CupomDTO;
import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import org.springframework.stereotype.Component;

@Component
public class FormaPagamentoFactory {

    public FormaPagamento createFrom(FormaPagamentoDTO formaPagamentoDTO)
    {
        return    FormaPagamento.builder()
                .bandeira(formaPagamentoDTO.getBandeira())
                .codigoSeguranca(formaPagamentoDTO.getCodigoSeguranca())
                .nomeCartao(formaPagamentoDTO.getNomeCartao())
                .numeroCartao(formaPagamentoDTO.getNumeroCartao())
                .build();

    }
}
