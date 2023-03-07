package br.com.ProjetoLoja.produto.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.produto.repository.ProdutoRepository;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProdutoService {


    private final ProdutoRepository produtoRepository;


    public List<ProdutoVO> getAll() {
        return this.produtoRepository.findAllByProduto();
    }

    public List<ProdutoVO> detalhar(Long IdCupom) {
        return this.produtoRepository.findByOne(IdCupom);
    }

}
