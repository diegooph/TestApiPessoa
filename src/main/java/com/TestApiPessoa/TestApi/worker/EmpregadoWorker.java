package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.HoristaDAo;
import com.TestApiPessoa.TestApi.dto.EmpregadoDto;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpregadoWorker {

    @Autowired
    private HoristaDAo horistaDAo;
    public EmpregadoWorker(HoristaDAo horistaDAo) {
        this.horistaDAo = horistaDAo;
    }

    public void savaEmpregado(EmpregadoDto empregadoDto) {

    }

}
