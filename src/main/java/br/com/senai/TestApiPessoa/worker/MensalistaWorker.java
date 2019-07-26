package br.com.senai.TestApiPessoa.worker;

import br.com.senai.TestApiPessoa.entity.Mensalista;
import br.com.senai.TestApiPessoa.dao.MensalistaDao;
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
