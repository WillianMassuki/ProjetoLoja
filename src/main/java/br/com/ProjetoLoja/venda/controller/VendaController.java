package br.com.ProjetoLoja.venda.controller;

import br.com.ProjetoLoja.produto.dto.ProdutoDTO;
import br.com.ProjetoLoja.produto.vo.ProdutoVO;
import br.com.ProjetoLoja.venda.dto.VendaDTO;
import br.com.ProjetoLoja.venda.service.VendaService;
import br.com.ProjetoLoja.venda.vo.VendaVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/venda")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas as vendas realizadas ")
    public List<VendaVO> vendas() {
        return this.vendaService.getAll();
    }


    @GetMapping("{vendaId}")
    @Operation(summary = "Lista a venda pelo codigo")
    public ResponseEntity<VendaVO> detalhar(@PathVariable Long vendaId)
    {
        return  ResponseEntity.of(this.vendaService.detalhar(vendaId));
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui uma nova venda")
    public ResponseEntity<Long> incluirVenda(
            @RequestBody VendaDTO vendaDTO
    ) {
        return ResponseEntity.ok(this.vendaService.salvar(vendaDTO));
    }
}
