package br.com.ProjetoLoja.cupomProduto.controller;

import br.com.ProjetoLoja.cupom.vo.CupomVO;
import br.com.ProjetoLoja.cupomProduto.dto.CupomProdutoDTO;
import br.com.ProjetoLoja.cupomProduto.repository.CupomProdutoRepository;
import br.com.ProjetoLoja.cupomProduto.service.CupomProdutoService;
import br.com.ProjetoLoja.cupomProduto.vo.CupomProdutoVO;
import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/cupomProduto")
@RequiredArgsConstructor
public class CupomProdutoController {

    private final CupomProdutoService cupomProdutoService;

    @GetMapping("{cupomId}")
    @Operation(summary = "Lista o cupom do Produto pelo codigo")
    public ResponseEntity<CupomProdutoVO> cupons(@PathVariable Long cupomProdutoId)
    {
        return  ResponseEntity.of(this.cupomProdutoService.detalhar(cupomProdutoId));

    }


    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui um cupom produto")
    public ResponseEntity<Long> adionarCupomProduto(
            @RequestBody CupomProdutoDTO cupomProdutoDTO
    ) {
        return ResponseEntity.ok(this.cupomProdutoService.salvar(cupomProdutoDTO));
    }



}
