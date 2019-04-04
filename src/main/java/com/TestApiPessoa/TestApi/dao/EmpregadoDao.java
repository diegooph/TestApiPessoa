package com.TestApiPessoa.TestApi.dao;

import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Horista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoDao extends JpaRepository<EmpregadoImp, Long> {
}
