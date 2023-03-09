package br.com.ProjetoLoja.produto.controller;

import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.factory.ProdutoFactory;
import br.com.ProjetoLoja.produto.repository.ProdutoRepository;
import br.com.ProjetoLoja.produto.service.ProdutoService;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    private final ProdutoFactory produtoFactory;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas os programas existentes")
    public List<ProdutoVO> programas() {
        return this.produtoService.getAll();
    }
    
    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui ou atualiza um novo programa")
    public ResponseEntity<Long> programas(
            @RequestBody ProdutoDTO produtoDTO
    ) {
        return ResponseEntity.ok(this.produtoService.salvar(produtoDTO));
    }

}
