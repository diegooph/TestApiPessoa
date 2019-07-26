package br.com.senai.TestApiPessoa.dao;

import br.com.senai.TestApiPessoa.entity.Mensalista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensalistaDao  extends JpaRepository<Mensalista, Long> {
}
