package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Horista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensalistaDao  extends JpaRepository<Horista, Long> {
}
