package com.TestApiPessoa.TestApi.dto;

import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpregadoDtoTest {

    @Test
    public void fromEvent() {
    }

    @Test
    public void horistaToEmpregadoDto() {
        EmpregadoImp empregadoImp = new Mensalista(220.0,100.0,"Diiego");
        Double valorHora =  empregadoImp.calcularSalarioBruto();
        System.out.println(valorHora);
    }
}