package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.HoristaDao;
import com.TestApiPessoa.TestApi.dao.MensalistaDao;
import com.TestApiPessoa.TestApi.dao.TemporarioDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.Horista;
import com.TestApiPessoa.TestApi.entity.Mensalista;
import com.TestApiPessoa.TestApi.entity.Temporario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpregadoWorker {

    @Autowired
    private HoristaDao horistaDao;
    @Autowired
    private MensalistaDao mensalistaDao;
    @Autowired
    private TemporarioDao temporarioDao;


    public EmpregadoWorker() {

    }


    public void savaEmpregado(EmpregadoDto empregadoDto) {
        switch (empregadoDto.tipoEmpregado) {
            case "mensalista":
                saveMensalista(empregadoDto);
                break;
            case "horista":
                saveHorista(empregadoDto);
                break;
            case "temporario":
                saveTemporario(empregadoDto);
                break;
        }
    }

    private void saveMensalista(EmpregadoDto empregadoDto) {
        Mensalista mensalista = new Mensalista();
        mensalista.setQtdHorasTrab(empregadoDto.qtdHorasTrab);
        mensalista.setValorHora(empregadoDto.valorHora);
        mensalista.setName(empregadoDto.name);
        mensalistaDao.save(mensalista);
        return;
    }

    private void saveHorista(EmpregadoDto empregadoDto) {
        Horista horista = new Horista();
        horista.setQtdHorasTrab(empregadoDto.qtdHorasTrab);
        horista.setValorHora(empregadoDto.valorHora);
        horista.setName(empregadoDto.name);
        horistaDao.save(horista);
    }

    private void saveTemporario(EmpregadoDto empregadoDto) {
        Temporario temporario = new Temporario();
        temporario.setQtdHorasTrab(empregadoDto.qtdHorasTrab);
        temporario.setValorHora(empregadoDto.valorHora);
        temporario.setName(empregadoDto.name);
        temporarioDao.save(temporario);
    }


}
