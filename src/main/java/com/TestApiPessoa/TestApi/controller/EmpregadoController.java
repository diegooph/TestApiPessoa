package com.TestApiPessoa.TestApi.controller;

import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.worker.EmpregadoWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/empregado")
@EnableWebMvc
@CrossOrigin
public class EmpregadoController {
    @Autowired
    EmpregadoWorker empregadoWorker;
    @PostMapping("/save")
    public void save(@RequestBody EmpregadoDto empregadoDto){
        empregadoWorker.save(empregadoDto);
    }
}
