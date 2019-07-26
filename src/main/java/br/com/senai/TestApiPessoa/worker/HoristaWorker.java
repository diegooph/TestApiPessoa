package br.com.senai.TestApiPessoa.worker;

import br.com.senai.TestApiPessoa.dao.HoristaDao;
import br.com.senai.TestApiPessoa.entity.Horista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoristaWorker {

    @Autowired
    private HoristaDao horistaDao;

    public List<Horista> getAll() {
        return horistaDao.findAll();
    }

}
