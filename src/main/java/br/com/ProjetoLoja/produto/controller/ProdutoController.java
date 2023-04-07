package br.com.ProjetoLoja.produto.controller;

import br.com.ProjetoLoja.cupom.vo.CupomVO;
import br.com.ProjetoLoja.endereco.dto.AlteracaoEnderecoDTO;
import br.com.ProjetoLoja.produto.dto.AlteracaoProdutoDTO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.factory.ProdutoFactory;
import br.com.ProjetoLoja.produto.repository.ProdutoRepository;
import br.com.ProjetoLoja.produto.service.ProdutoService;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas os programas existentes")
    public List<ProdutoVO> listagemEstoque() {
        return this.produtoService.getAll();
    }

    @GetMapping("{produtoId}")
    @Operation(summary = "Lista o cupom pelo codigo")
    public ResponseEntity<ProdutoVO> detalhar(@PathVariable Long produtoId)
    {
        return  ResponseEntity.of(this.produtoService.detalhar(produtoId));
    }
    
    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui ou atualiza um novo programa")
    public ResponseEntity<Long> addProduto(
            @RequestBody ProdutoDTO produtoDTO
    ) {
        return ResponseEntity.ok(this.produtoService.salvar(produtoDTO));
    }
    @PutMapping(value = "/{produtoId}", produces = "application/json")
    @Operation(summary = "Atualiza o produto")
    public ResponseEntity<Long> atualizaProduto(
            @PathVariable Long produtoId,
            @Valid @RequestBody AlteracaoProdutoDTO alteracaoProdutoDTO
    ) {
        return ResponseEntity.of(this.produtoService.alterar(produtoId, alteracaoProdutoDTO));

    }


}
