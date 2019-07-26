package br.com.senai.gerenciamentoDeContas.dao;

import br.com.senai.gerenciamentoDeContas.entity.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoDao extends JpaRepository<Operacao, Long> {
}
