package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Horista implements Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;

    private Double valorHora;
    private Double qtdHorasTrab;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Double calculalrSalarioLiquido() {
        return calcularSalarioBruto();
    }

    @Override
    public double calcularSalarioBruto() {
        return ((qtdHorasTrab / 21) * 5) * valorHora;
    }

    @Override
    public String getNomeEmpregado() {
        return "Horista: " + getName();
    }
}
