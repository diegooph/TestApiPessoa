package com.TestApiPessoa.TestApi.entity;

import com.TestApiPessoa.TestApi.entity.Interface.Empregado;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Temporario  implements Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
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

    private double getDescInss(Double salarioBruto) {
        return (salarioBruto <= 1000) ? 8.0 : 9.0;
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

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
