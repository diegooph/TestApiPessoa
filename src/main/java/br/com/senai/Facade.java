package br.com.senai;

import br.com.senai.TesetLogico.controller.LogicaController;
import br.com.senai.TestApiPessoa.controller.EmpregadoController;
import br.com.senai.TestApiPessoa.dto.EmpregadoDto;
import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import br.com.senai.gerenciamentoDeContas.controller.BancoController;
import br.com.senai.gerenciamentoDeContas.entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@RequestMapping("/")
@EnableWebMvc
@CrossOrigin
public class Facade {

    @Autowired
    EmpregadoController empregadoController;
    @Autowired
    BancoController bancoController;

    @Autowired
    LogicaController logicaController;

    @PostMapping("empregado/save")
    public void save(@RequestBody EmpregadoDto empregadoDto) {
        empregadoController.save(empregadoDto);
    }

    @GetMapping("empregado/all")
    public List<EmpregadoImp> getAllEmpregados() {
        return empregadoController.getAll();
    }

    @GetMapping("empregado/getallbytipe/{tipoEmpregado}")
    public List<EmpregadoImp> getAllByType(@PathVariable("tipoEmpregado") String tipoEmpregado) {
        return empregadoController.getAllByTipe(tipoEmpregado);
    }

    @GetMapping("empregado/get/{id}")
    public EmpregadoImp getById(@PathVariable("id") Long id) {
        return empregadoController.getById(id);
    }

    @DeleteMapping("empregado/delete/{id}")
    public void deleteEmpregado(@PathVariable("id") Long id) {
        empregadoController.delete(id);
    }

    @PostMapping("conta/novaconta")
    public Conta criarConta(String nome) {
        return bancoController.criarConta(nome);
    }

    @GetMapping("conta/getsaldo/{id}")
    public Double verificarSaldo(@PathVariable("id") Long idConta) {
        return bancoController.verificarSaldo(idConta);
    }

    @GetMapping("testlogico/{numero}")
    public String verificarFizzBuzz(@PathVariable("numero") Long numero) {
        return logicaController.fizzbuzz(numero);
    }
}
