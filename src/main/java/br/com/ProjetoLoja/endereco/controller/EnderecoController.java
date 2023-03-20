package br.com.ProjetoLoja.endereco.controller;

import br.com.ProjetoLoja.endereco.service.EnderecoService;
import br.com.ProjetoLoja.endereco.vo.EnderecoVO;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/endereco")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todos os enderecos cadastrados")
    public List<EnderecoVO> enderecos() {
        return this.enderecoService.getAll();
    }

    @GetMapping("{produtoId}")
    @Operation(summary = "Lista o endereco pelo codigo")
    public ResponseEntity<EnderecoVO> detalhar(@PathVariable Long produtoId)
    {
        return  ResponseEntity.of(this.enderecoService.detalhar(produtoId));

    }



}
