package com.TestApiPessoa.TestApi.controller;

import com.TestApiPessoa.TestApi.dao.PessoaDao;
import com.TestApiPessoa.TestApi.dto.PessoaDto;
import com.TestApiPessoa.TestApi.worker.PessoaWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/pessoa")
@EnableWebMvc
@CrossOrigin
public class PessoaController {
    @Autowired
    private PessoaDao pessoaDao;

    @PostMapping("/save")
    public void save(@RequestBody PessoaDto pessoaDto){
        new PessoaWorker(pessoaDao).salvarPessoa(pessoaDto);
    }
}
