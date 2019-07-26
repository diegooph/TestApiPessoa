package br.com.senai.TestApiPessoa.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Horista extends EmpregadoImp {

    private Double valorHora;
    private Double qtdHorasTrab;

    public Horista(Double valorHora, Double qtdHorasTrab, String name) {
        super(name);
        this.valorHora = valorHora;
        this.qtdHorasTrab = qtdHorasTrab;
    }

    public Horista(@NotNull String name) {
        super(name);
    }

    public Horista() {
        super("JpAConfiguration");
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

    @Override
    public Double getSalarioLiquido() {
        return getSalarioBruto();
    }

    @Override
    public double getSalarioBruto() {
        return ((qtdHorasTrab / 21) * 5) * valorHora;
    }

    @Override
    public String getTipoEmpregado() {
        return "Horista";
    }
}
