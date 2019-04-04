package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensalistaDao  extends JpaRepository<Mensalista, Long> {
}
