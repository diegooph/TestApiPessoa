package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporarioDao  extends JpaRepository<Temporario, Long> {
}
