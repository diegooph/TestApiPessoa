package br.com.senai.TestApiPessoa.dao;

import br.com.senai.TestApiPessoa.entity.Temporario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporarioDao  extends JpaRepository<Temporario, Long> {
}
