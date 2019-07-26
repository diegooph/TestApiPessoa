package br.com.senai.TestApiPessoa.dao;

import br.com.senai.TestApiPessoa.entity.Horista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoristaDao extends JpaRepository<Horista, Long> {
}
