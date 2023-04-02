package br.com.ProjetoLoja.formaPagamento.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.formaPagamento.dto.AlteracaoFormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.factory.FormaPagamentoFactory;
import br.com.ProjetoLoja.formaPagamento.model.FormaPagamento;
import br.com.ProjetoLoja.formaPagamento.repository.FormaPagamentoRepository;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.produto.dto.AlteracaoProdutoDTO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.exception.ProdutoJaExistente;
import br.com.ProjetoLoja.produto.model.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class FormaPagamentoService {


    private final FormaPagamentoRepository formaPagamentoRepository;

    private final FormaPagamentoFactory formaPagamentoFactory;

    public List<FormaPagamentoVO> getAll() {
        return this.formaPagamentoRepository.findAllBy();
    }

    public Optional<FormaPagamentoVO> detalhar(Long IdCupom) {
        return this.formaPagamentoRepository.findByOne(IdCupom);
    }

    public Long salvar(FormaPagamentoDTO formaPagamentoDTO) {

        this.formaPagamentoRepository.findByOne(
                formaPagamentoDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(formaPagamentoDTO.getId());
                }
        );

        return this.formaPagamentoRepository.save(
                this.formaPagamentoFactory.createFrom(formaPagamentoDTO)
        ).getId();
    }

/*
    public Optional<Long> alterar(Long id, AlteracaoFormaPagamentoDTO alteracaoFormaPagamentoDTO)
    {
        return this.formaPagamentoRepository.findById(id)
                .map(FormaPagamento ->
                        FormaPagamento.toBuilder()
                                .

                                .build()
                ).map(this.formaPagamentoRepository::save)
                .map(FormaPagamento::getId);
    }

 */



}
