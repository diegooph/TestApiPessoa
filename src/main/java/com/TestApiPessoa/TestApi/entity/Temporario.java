package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Temporario extends Pessoa implements Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTemporario;
    private String name;
    private Double valorHora;
    private Double qtdHorasTrab;

    @Override
    public Double calculalrSalarioLiquido() {
        Double salarioBruto = calcularSalarioBruto();
        Double descInss = getDescInss(salarioBruto);

        return salarioBruto - (salarioBruto * descInss / 100);
    }

    @Override
    public double calcularSalarioBruto() {
        return qtdHorasTrab * valorHora;
    }

    @Override
    public String getNomeEmpregado() {
        return "Temporario: " + getName();
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getIdTemporario() {
        return idTemporario;
    }

    private double getDescInss(Double salarioBruto) {
        return (salarioBruto <= 1000) ? 8.0 : 9.0;
    }

}
