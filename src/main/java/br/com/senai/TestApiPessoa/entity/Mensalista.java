package br.com.senai.TestApiPessoa.entity;

import javax.persistence.*;

@Entity
public class Mensalista extends EmpregadoImp {

    private Double valorHora;
    private Double qtdHorasTrab;

    public Mensalista(Double valorHora, Double qtdHorasTrab, String name) {
        super(name);
        this.valorHora = valorHora;
        this.qtdHorasTrab = qtdHorasTrab;
    }

    public Mensalista() {
       super("JpAConfiguration");
    }

    @Override
    public Double getSalarioLiquido() {
        Double salarioBruto = getSalarioBruto();
        Double descInss = getDescInss(salarioBruto);
        Double descIr = getDescIr(salarioBruto);
        return salarioBruto - (salarioBruto * (descInss + descIr) / 100);
    }

    @Override
    public double getSalarioBruto() {
        return qtdHorasTrab * valorHora;
    }

    @Override
    public String getTipoEmpregado() {
        return "Mensalista";
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
