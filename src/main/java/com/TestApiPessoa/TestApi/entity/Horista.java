package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
public class Horista extends EmpregadoImp implements Empregado {


    private Double valorHora;
    private Double qtdHorasTrab;

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
