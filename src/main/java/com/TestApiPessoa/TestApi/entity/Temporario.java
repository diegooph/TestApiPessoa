package com.TestApiPessoa.TestApi.entity;

import javax.persistence.Entity;

@Entity
public class Temporario extends EmpregadoImp {

    private Double valorHora;
    private Double qtdHorasTrab;

    public Temporario(Double valorHora, Double qtdHorasTrab ,String name) {
        super(name);
        this.valorHora = valorHora;
        this.qtdHorasTrab = qtdHorasTrab;
    }
    public Temporario() {
        super("JpAConfiguration");
    }
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

    private double getDescInss(Double salarioBruto) {
        return (salarioBruto <= 1000) ? 8.0 : 9.0;
    }
}
