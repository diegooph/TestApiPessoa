package br.com.senai.TestApiPessoa.worker;

import br.com.senai.TestApiPessoa.dao.EmpregadoDao;
import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadoWorker {


    @Autowired
    private EmpregadoDao empregadoDao;

    public void save(EmpregadoImp empregado) {
        empregadoDao.save(empregado);
    }

    public EmpregadoImp getById(Long id) {
        return empregadoDao.getOne(id);
    }

    public List<EmpregadoImp> getAll() {
        return empregadoDao.findAll();
    }

    public void delete(Long id) {
        empregadoDao.deleteById(id);
    }
}

