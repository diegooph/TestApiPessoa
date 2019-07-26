package br.com.senai.TestApiPessoa.dao;

import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoDao extends JpaRepository<EmpregadoImp, Long> {
}
