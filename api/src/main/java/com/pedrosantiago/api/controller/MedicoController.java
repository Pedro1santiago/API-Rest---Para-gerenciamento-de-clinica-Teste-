package com.pedrosantiago.api.controller;


import com.pedrosantiago.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadatras(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }
}
