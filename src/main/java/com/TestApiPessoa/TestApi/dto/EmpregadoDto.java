package com.TestApiPessoa.TestApi.dto;

import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;

import java.util.ArrayList;
import java.util.List;

public class EmpregadoDto {
    public Long id;
    public String name;
    public Double valorHora;
    public Double qtdHorasTrab;
    public String tipoEmpregado;

    public static List<EmpregadoDto> fromEvent(List<EmpregadoImp> empregadoImps) {
        List<EmpregadoDto> resp = new ArrayList<EmpregadoDto>();
        return resp;
    }

    public static EmpregadoImp horistaToEmpregadoDto(EmpregadoDto empregadoDto) {
        return new Horista(empregadoDto.valorHora, empregadoDto.qtdHorasTrab, empregadoDto.name);

    }

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
