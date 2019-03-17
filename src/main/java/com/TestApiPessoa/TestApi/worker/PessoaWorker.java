package com.TestApiPessoa.TestApi.worker;

import com.TestApiPessoa.TestApi.dao.PessoaDao;
import com.TestApiPessoa.TestApi.dto.PessoaDto;
import com.TestApiPessoa.TestApi.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;

public class PessoaWorker {

    @Autowired
    private PessoaDao pessoaDao;
    public PessoaWorker(PessoaDao pessoaDao) {
        this.pessoaDao =pessoaDao;
    }

    public void salvarPessoa(PessoaDto pessoaDto) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDto.nome);
        pessoaDao.save(pessoa);
    }

}
