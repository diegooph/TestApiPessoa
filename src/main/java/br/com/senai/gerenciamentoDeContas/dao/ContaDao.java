package br.com.senai.gerenciamentoDeContas.dao;

import br.com.senai.gerenciamentoDeContas.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public interface ContaDao extends JpaRepository<Conta, Long> {

}

