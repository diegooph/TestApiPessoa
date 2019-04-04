package com.TestApiPessoa.TestApi.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EmpregadoImp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;

    public EmpregadoImp(@NotNull String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
