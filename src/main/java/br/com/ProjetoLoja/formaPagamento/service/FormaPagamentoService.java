package br.com.ProjetoLoja.formaPagamento.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.formaPagamento.repository.FormaPagamentoRepository;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FormaPagamentoService {

    /*
    private final FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamentoVO> getAll() {
        return this.formaPagamentoRepository.findAllBy();
    }

    public List<FormaPagamentoVO> detalhar(Long IdCupom) {
        return this.formaPagamentoRepository.findByOne(IdCupom);
    }


     */
}
