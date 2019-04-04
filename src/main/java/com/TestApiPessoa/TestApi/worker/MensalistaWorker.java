package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.MensalistaDao;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensalistaWorker {

    @Autowired
    private MensalistaDao mensalistaDao;

    public void save(Mensalista mensalista) {
        mensalistaDao.save(mensalista);
    }
    public void delete(Mensalista horista) {
        mensalistaDao.delete(horista);
    }

    public Mensalista getById(Long id) {
        return mensalistaDao.getOne(id);
    }

    public List<Mensalista> getAllHoristas() {
        return mensalistaDao.findAll();
    }

}
