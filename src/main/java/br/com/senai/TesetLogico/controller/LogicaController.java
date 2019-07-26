package br.com.senai.TesetLogico.controller;


import br.com.senai.TesetLogico.worker.LogicaWorker;
import org.springframework.stereotype.Service;


@Service
public class LogicaController {

    public String fizzbuzz(Long numero) {

        String fizzBuzz;
        fizzBuzz = new LogicaWorker().fizzBuzz(numero);
        return fizzBuzz;
    }


}
