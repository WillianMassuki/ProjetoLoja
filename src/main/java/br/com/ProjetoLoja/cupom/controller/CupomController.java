package br.com.ProjetoLoja.cupom.controller;

import br.com.ProjetoLoja.cupom.dto.CupomDTO;
import br.com.ProjetoLoja.cupom.service.CupomService;
import br.com.ProjetoLoja.cupom.vo.CupomVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/cupom")
@RequiredArgsConstructor
public class CupomController {

    @Autowired
    private  CupomService cupomService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todos os cupons existentes")
    public List<CupomVO> cupons() {
        return this.cupomService.getAll();
    }

    @GetMapping("{cupomId}")
    @Operation(summary = "Lista o cupom pelo codigo")
    public ResponseEntity<CupomVO> listCupom(@PathVariable Long cupomId)
    {
        return  ResponseEntity.of(this.cupomService.detalhar(cupomId));

    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui um novo cupom")
    public ResponseEntity<Long> cupom(
            @RequestBody CupomDTO cupomDTO
    ) {
        return ResponseEntity.ok(this.cupomService.salvar(cupomDTO));
    }


}
