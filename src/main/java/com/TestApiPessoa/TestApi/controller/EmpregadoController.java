package com.TestApiPessoa.TestApi.controller;

import com.TestApiPessoa.TestApi.dao.HoristaDAo;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.worker.EmpregadoWorker;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/empregado")
@EnableWebMvc
@CrossOrigin
public class EmpregadoController {
//    @Autowired
//    private ;

    @PostMapping("/horista/save")
    public void save(@RequestBody EmpregadoDto empregadoDto){
       // new EmpregadoWorker.savaEmpregado(empregadoDto);
    }
}
