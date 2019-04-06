package com.TestApiPessoa.TestApi.controller;

import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Interface.Empregado;
import com.TestApiPessoa.TestApi.worker.EmpregadoWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

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

    @GetMapping("/all")
    public List<EmpregadoImp> getAllEmpregados(@RequestBody EmpregadoDto empregadoDto){
    return  empregadoWorker.getAll();
    }

    @GetMapping("/getallbytipe/{tipoEmpregado}")
    public List<EmpregadoImp> getAllByTipe(@PathVariable("tipoEmpregado") String tipoEmpregado){
        return empregadoWorker.getAllByTipe(tipoEmpregado);
    }

    @GetMapping("/get/{id}")
    public EmpregadoImp getById(@PathVariable("id") Long id){
        return empregadoWorker.getById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        empregadoWorker.delete(id);
    }
}
