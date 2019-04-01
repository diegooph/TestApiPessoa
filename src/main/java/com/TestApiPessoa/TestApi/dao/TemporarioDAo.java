package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporarioDAo extends JpaRepository<Temporario, Long> {
}