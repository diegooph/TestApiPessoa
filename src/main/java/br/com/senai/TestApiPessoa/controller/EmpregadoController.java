package br.com.senai.TestApiPessoa.controller;

import br.com.senai.TestApiPessoa.dto.EmpregadoDto;
import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import br.com.senai.TestApiPessoa.worker.EmpregadoWorker;
import br.com.senai.TestApiPessoa.worker.HoristaWorker;
import br.com.senai.TestApiPessoa.worker.MensalistaWorker;
import br.com.senai.TestApiPessoa.worker.TemporarioWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpregadoController {

    @Autowired
    EmpregadoWorker empregadoWorker;
    @Autowired
    private HoristaWorker horistaWorker;
    @Autowired
    private MensalistaWorker mensalistaWorker;
    @Autowired
    private TemporarioWorker temporarioWorker;

    public void save(EmpregadoDto empregadoDto) {
        empregadoWorker.save(empregadoDto.castToCorrectTipe());
    }

    public List<EmpregadoImp> getAll() {
        return empregadoWorker.getAll();
    }

    public EmpregadoImp getById(Long id) {
        return empregadoWorker.getById(id);
    }

    public void delete(Long id) {
        empregadoWorker.delete(id);
    }

    public List<EmpregadoImp> getAllByTipe(String tipoEmpregado) {
        switch (tipoEmpregado) {
            case "mensalista":
                return new ArrayList<>(mensalistaWorker.getAll());
            case "horista":
                return new ArrayList<>(horistaWorker.getAll());
            case "temporario":
                return new ArrayList<>(temporarioWorker.getAll());
            default:
                return new ArrayList<>(empregadoWorker.getAll());
        }
    }
}
