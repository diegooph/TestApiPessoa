package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Mensalista  implements Empregado {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Double calculalrSalarioLiquido() {
        Double salarioBruto = calcularSalarioBruto();
        Double descInss = getDescInss(salarioBruto);
        Double descIr = getDescIr(salarioBruto);
        return salarioBruto - (salarioBruto * (descInss + descIr) / 100);
    }

    @Override
    public double calcularSalarioBruto() {
        return qtdHorasTrab * valorHora;
    }

    @Override
    public String getNomeEmpregado() {
        return "Mensalista: " + getName();
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getQtdHorasTrab() {
        return qtdHorasTrab;
    }

    public void setQtdHorasTrab(Double qtdHorasTrab) {
        this.qtdHorasTrab = qtdHorasTrab;
    }


    private double getDescIr(Double salarioBruto) {
        return (salarioBruto <= 500) ? 0 : ((salarioBruto <= 1000) ? 6.0 : 7.0);
    }

    private double getDescInss(Double salarioBruto) {
        return (salarioBruto <= 1000) ? 8.0 : 9.0;
    }
}
