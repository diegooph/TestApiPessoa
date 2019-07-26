package br.com.senai.gerenciamentoDeContas.controller;

import br.com.senai.gerenciamentoDeContas.dao.ContaDao;
import br.com.senai.gerenciamentoDeContas.dao.OperacaoDao;
import br.com.senai.gerenciamentoDeContas.dto.OperacaoDto;
import br.com.senai.gerenciamentoDeContas.entity.Conta;
import br.com.senai.gerenciamentoDeContas.entity.Operacao;
import br.com.senai.gerenciamentoDeContas.entity.TipoOperacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BancoController {

    @Autowired
    private ContaDao contaDao;
    @Autowired
    private OperacaoDao operacaoaDao;

    public Conta criarConta(String nome){
        return contaDao.saveAndFlush(new Conta(nome)) ;
    }
    public Boolean depositar(OperacaoDto operacaoDto){

        return false;
    }
    public Double verificarSaldo(Long idConta){
        List<Operacao> operacaoList = operacaoaDao.findAll();
        //fazer query
        double depositos = operacaoList.stream()
                .filter(operacao -> operacao.getContaDestino().getId().equals(idConta))
                .filter(operacao -> operacao.getTipoOperacao().equals(TipoOperacao.DEPOSITO))
                .mapToDouble(Operacao::getValor).sum();
        double saques = operacaoList.stream()
                .filter(operacao -> operacao.getContaDestino().getId().equals(idConta))
                .filter(operacao -> operacao.getTipoOperacao().equals(TipoOperacao.SAQUE))
                .mapToDouble(Operacao::getValor).sum();
        return depositos-saques;
    }
}
