package br.com.senai.gerenciamentoDeContas.worker;

import br.com.senai.gerenciamentoDeContas.dao.OperacaoDao;
import br.com.senai.gerenciamentoDeContas.entity.Operacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperaçãoWorker {

    @Autowired
    private OperacaoDao operacaoDao;

    public void save(Operacao operacao) {
        operacaoDao.save(operacao);
    }

    public Operacao getById(Long id) {
        return operacaoDao.getOne(id);
    }

    public List<Operacao> getAll() {
        return operacaoDao.findAll();
    }

    public void delete(Long id) {
        operacaoDao.deleteById(id);
    }
}

