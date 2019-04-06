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

    public List<Mensalista> getAll() {
        return mensalistaDao.findAll();
    }

}
