package com.TestApiPessoa.TestApi.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Datasource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getIdPessoa() {
        return id;
    }

    public void setIdPessoa(Long idPessoa) {
        this.id = idPessoa;
    }
}
