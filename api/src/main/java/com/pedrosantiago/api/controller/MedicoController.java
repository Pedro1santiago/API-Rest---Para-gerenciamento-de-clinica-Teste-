package com.pedrosantiago.api.controller;


import com.pedrosantiago.api.medico.MedicoRepository;
import com.pedrosantiago.api.medico.DadosCadastroMedico;
import com.pedrosantiago.api.medico.Medico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;


    @PostMapping
    @Transactional
    public void cadatras(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
