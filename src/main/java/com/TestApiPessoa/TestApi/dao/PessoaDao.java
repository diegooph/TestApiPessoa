package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa , Long> {
}
