package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.EmpregadoDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.EmpregadoImp;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadoWorker {

    @Autowired
    private HoristaWorker horistaWorker;
    @Autowired
    private MensalistaWorker mensalistaWorker;
    @Autowired
    private TemporarioWorker temporarioWorker;
    @Autowired
    private EmpregadoDao empregadoDao;

    public void save(EmpregadoDto empregadoDto) {
        switch (empregadoDto.tipoEmpregado) {
            case "mensalista":
                mensalistaWorker.save(castToMensalista(empregadoDto));
                break;
            case "horista":
                horistaWorker.save(castToHorista(empregadoDto));
                break;
            case "temporario":
                temporarioWorker.save(castToTemporario(empregadoDto));
                break;
        }
    }

    public EmpregadoImp getByid(EmpregadoDto empregadoDto) {
        switch (empregadoDto.tipoEmpregado) {
            case "mensalista":
                return mensalistaWorker.getById(castToMensalista(empregadoDto).getId());
            case "horista":
                return horistaWorker.getById(castToHorista(empregadoDto).getId());
            case "temporario":
                return temporarioWorker.getById(castToTemporario(empregadoDto).getId());
            default:
                return null;
        }
    }

    public List<EmpregadoImp> getAll(EmpregadoDto empregadoDto) {
        return empregadoDao.findAll();
    }


    private Temporario castToTemporario(EmpregadoDto empregadoDto) {
        return new Temporario(
                empregadoDto.valorHora,
                empregadoDto.qtdHorasTrab,
                empregadoDto.name
        );
    }

    private Horista castToHorista(EmpregadoDto empregadoDto) {
        return new Horista(
                empregadoDto.valorHora,
                empregadoDto.qtdHorasTrab,
                empregadoDto.name
        );
    }

    private Mensalista castToMensalista(EmpregadoDto empregadoDto) {
        return new Mensalista(
                empregadoDto.valorHora,
                empregadoDto.qtdHorasTrab,
                empregadoDto.name
        );
    }
}
