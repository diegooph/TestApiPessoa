package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.TemporarioDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporarioWorker {

    @Autowired
    private TemporarioDao temporarioDao;

    public void save(Temporario temporario) {
        temporarioDao.save(temporario);
    }

    public void delete(Temporario horista) {
        temporarioDao.delete(horista);
    }

    public Temporario getById(Long id) {
        return temporarioDao.getOne(id);
    }

    public List<Temporario> getAllHoristas() {
        return temporarioDao.findAll();
    }
}
