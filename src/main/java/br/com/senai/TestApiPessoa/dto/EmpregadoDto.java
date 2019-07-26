package br.com.senai.TestApiPessoa.dto;

import br.com.senai.TestApiPessoa.entity.EmpregadoImp;
import br.com.senai.TestApiPessoa.entity.Mensalista;
import br.com.senai.TestApiPessoa.entity.Horista;
import br.com.senai.TestApiPessoa.entity.Temporario;

public class EmpregadoDto {
    public Long id;
    public String name;
    public Double valorHora;
    public Double qtdHorasTrab;
    public String tipoEmpregado;

    public Temporario castToTemporario() {
        return new Temporario(
                this.valorHora,
                this.qtdHorasTrab,
                this.name
        );
    }

    public Horista castToHorista() {
        return new Horista(
                this.valorHora,
                this.qtdHorasTrab,
                this.name
        );
    }

    public Mensalista castToMensalista() {
        return new Mensalista(
                this.valorHora,
                this.qtdHorasTrab,
                this.name
        );
    }

    public EmpregadoImp castToCorrectTipe() {
        switch (tipoEmpregado) {
            case "mensalista":
                return castToMensalista();
            case "horista":
                return castToHorista();
            case "temporario":
                return castToTemporario() ;
            default:
                return null;
        }
    }
}
