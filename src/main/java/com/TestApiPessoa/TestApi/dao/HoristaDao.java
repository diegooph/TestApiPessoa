package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.Horista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoristaDao extends JpaRepository<Horista, Long> {
}
