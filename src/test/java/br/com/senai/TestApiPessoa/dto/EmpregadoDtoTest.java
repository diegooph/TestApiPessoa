package br.com.senai.TestApiPessoa.dto;

import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import br.com.senai.TestApiPessoa.entity.Mensalista;
import org.junit.Test;

public class EmpregadoDtoTest {

    @Test
    public void fromEvent() {
    }

    @Test
    public void horistaToEmpregadoDto() {
        EmpregadoImp empregadoImp = new Mensalista(220.0,100.0,"Diiego");
        Double valorHora =  empregadoImp.getSalarioBruto();
        System.out.println(valorHora);
    }
}