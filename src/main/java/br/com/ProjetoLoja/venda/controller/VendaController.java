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
@RequestMapping(value = "/pedido")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas os programas existentes")
    public List<VendaVO> programas() {
        return this.vendaService.getAll();
    }

    @GetMapping("{produtoId}")
    @Operation(summary = "Lista o cupom pelo codigo")
    public ResponseEntity<VendaVO> detalhar(@PathVariable Long vendaID)
    {
        return  ResponseEntity.of(this.vendaService.detalhar(vendaID));
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui ou atualiza um novo programa")
    public ResponseEntity<Long> incluirVenda(
            @RequestBody VendaDTO vendaDTO
    ) {
        return ResponseEntity.ok(this.vendaService.salvar(vendaDTO));
    }
}
