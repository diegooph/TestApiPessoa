package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.EmpregadoDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Interface.Empregado;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpregadoWorker {

    @Autowired
    private HoristaWorker horistaWorker;
    @Autowired
    private MensalistaWorker mensalistaWorker;
    @Autowired
    private TemporarioWorker temporarioWorker;
    @Autowired
    private EmpregadoDao empregadoDao;

    public void save(EmpregadoDto empregadoDto) {
        empregadoDao.save(empregadoDto.castToCorrectTipe());
    }

    public EmpregadoImp getById(Long id) {
        return empregadoDao.getOne(id);
    }

    public List<EmpregadoImp> getAll() {
        return empregadoDao.findAll();
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
                return new ArrayList<>();
        }
    }

    public void delete(Long id) {
        empregadoDao.deleteById(id);
    }
}

