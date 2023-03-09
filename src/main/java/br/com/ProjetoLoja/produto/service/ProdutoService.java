package br.com.ProjetoLoja.produto.service;

import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.exception.ProdutoJaExistente;
import br.com.ProjetoLoja.produto.factory.ProdutoFactory;
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

    private final ProdutoFactory produtoFactory;


    public List<ProdutoVO> getAll() {
        return this.produtoRepository.findAllByProduto();
    }

    public List<ProdutoVO> detalhar(Long IdProduto) {
        return this.produtoRepository.findByOne(IdProduto);
    }

    public Long salvar(ProdutoDTO produtoDTO) {

        this.produtoRepository.findIdBy(
                produtoDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new ProdutoJaExistente(produtoDTO.getId());
                }
        );

        return this.produtoRepository.save(
                this.produtoFactory.createFrom(produtoDTO)
        ).getId();
    }

}
