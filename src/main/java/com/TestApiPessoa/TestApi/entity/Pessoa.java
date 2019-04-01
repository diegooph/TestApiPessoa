package com.TestApiPessoa.TestApi.entity;

public abstract class Pessoa extends Datasource {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
