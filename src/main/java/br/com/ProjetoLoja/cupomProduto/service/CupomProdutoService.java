package br.com.ProjetoLoja.cupomProduto.service;

import br.com.ProjetoLoja.cupom.vo.CupomVO;
import br.com.ProjetoLoja.cupomProduto.repository.CupomProdutoRepository;
import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CupomProdutoService {

    private final CupomProdutoRepository produtoRepository;

    public List<CupomProdutoVO> getAll() {
        return this.produtoRepository.findAllBy();
    }

    public List<CupomProdutoVO> detalhar(Long IdCupom) {
        return this.produtoRepository.findByOne(IdCupom);
    }
}
