package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horista extends Pessoa implements Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHorista;
    private String name;
    private Double valorHora;
    private Double qtdHorasTrab;

    @Override
    public Double calculalrSalarioLiquido() {
        return calcularSalarioBruto();
    }

    @Override
    public double calcularSalarioBruto() {
        return ((qtdHorasTrab/ 21) *5 )* valorHora;
    }

    public Long getIdHorista() {
        return idHorista;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNomeEmpregado() {
        return "Horista: " + getName();
    }
}
