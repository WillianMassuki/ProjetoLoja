package br.com.ProjetoLoja.cupom.factory;

import br.com.ProjetoLoja.cupom.dto.CupomDTO;
import br.com.ProjetoLoja.cupom.model.Cupom;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class CupomFactory {

    public Cupom createFrom(CupomDTO cupomDTO)
    {
        return    Cupom.builder()
                .codigoCupom(cupomDTO.getCodigoCupom())
                .pedido(cupomDTO.getPedido())
                .motivo(cupomDTO.getMotivo())
                .dataCriacao(cupomDTO.getDataCriacao())
                .dataAtualizacao(cupomDTO.getDataAtualizacao())
                .build();

    }
}
