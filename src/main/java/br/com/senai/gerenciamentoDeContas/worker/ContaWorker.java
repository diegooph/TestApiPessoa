package br.com.senai.gerenciamentoDeContas.worker;

import br.com.senai.gerenciamentoDeContas.dao.ContaDao;
import br.com.senai.gerenciamentoDeContas.entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaWorker {

    @Autowired
    private ContaDao contaDao;

    public void save(Conta conta) {
        contaDao.save(conta);
    }

    public Conta getById(Long id) {
        return contaDao.getOne(id);
    }

    public List<Conta> getAll() {
        return contaDao.findAll();
    }

    public void delete(Long id) {
        contaDao.deleteById(id);
    }
}

