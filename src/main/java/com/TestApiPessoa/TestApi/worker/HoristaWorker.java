package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.HoristaDao;
import com.TestApiPessoa.TestApi.dao.MensalistaDao;
import com.TestApiPessoa.TestApi.dao.TemporarioDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoristaWorker {

    @Autowired
    private HoristaDao horistaDao;

    public void save(Horista horista) {
        horistaDao.save(horista);
    }

    public void delete(Horista horista) {
        horistaDao.delete(horista);
    }

    public Horista getById(Long id) {
        return horistaDao.getOne(id);
    }

    public List<Horista> getAllHoristas() {
        return horistaDao.findAll();
    }

}
