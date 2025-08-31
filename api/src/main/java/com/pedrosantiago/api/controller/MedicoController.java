package com.pedrosantiago.api.controller;


import com.pedrosantiago.api.medico.*;
import com.pedrosantiago.api.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        service.cadastrar(dados);
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao ){
        return service.listar(paginacao);
    }

    @PutMapping
    public void atualizar(@RequestBody @Valid DadosAtualizaMedico dados){
        service.atualizar(dados);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }
}