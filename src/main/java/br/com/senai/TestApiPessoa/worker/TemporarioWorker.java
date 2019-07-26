package br.com.senai.TestApiPessoa.worker;

import br.com.senai.TestApiPessoa.entity.Temporario;
import br.com.senai.TestApiPessoa.dao.TemporarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporarioWorker {

    @Autowired
    private TemporarioDao temporarioDao;

    public List<Temporario> getAll() {
        return temporarioDao.findAll();
    }
}
