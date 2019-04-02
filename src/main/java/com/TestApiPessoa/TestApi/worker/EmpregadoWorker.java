package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.HoristaDao;
import com.TestApiPessoa.TestApi.dao.MensalistaDao;
import com.TestApiPessoa.TestApi.dao.TemporarioDao;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import com.TestApiPessoa.TestApi.entity.Horista;


public class EmpregadoWorker {

private HoristaDao horistaPessoaDao;
private MensalistaDao mensalistaDao;
private TemporarioDao temporarioDao;

    public EmpregadoWorker(HoristaDao horistaPessoaDao) {
       this.horistaPessoaDao = horistaPessoaDao;
    }

    public void savaEmpregado(EmpregadoDto empregadoDto) {
        Horista entity = new Horista();
        entity.setName("asda");
        horistaPessoaDao.save(entity);
    }

}
