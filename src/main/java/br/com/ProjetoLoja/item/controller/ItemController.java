package br.com.ProjetoLoja.item.controller;

import br.com.ProjetoLoja.formaPagamento.dto.FormaPagamentoDTO;
import br.com.ProjetoLoja.formaPagamento.vo.FormaPagamentoVO;
import br.com.ProjetoLoja.item.dto.ItemDTO;
import br.com.ProjetoLoja.item.service.ItemService;
import br.com.ProjetoLoja.item.vo.ItemVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas as formas de pagamentos cadastradas")
    public List<ItemVO> formasPagamentos() {
        return this.itemService.getAll();
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui um novo endereco")
    public ResponseEntity<Long> incluirItem(
            @RequestBody ItemDTO itemDTO
    ) {
        return ResponseEntity.ok(this.itemService.salvar(itemDTO));
    }


}
