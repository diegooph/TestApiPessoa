package br.com.senai.TesetLogico.worker;

import org.springframework.stereotype.Service;

@Service
public class LogicaWorker {
    public String fizzBuzz(Long numero) {
        return (numero % 3 == 0) && (numero % 5 == 0) ? "FizzBuzz" : numero % 3 == 0 ? "fizz" : numero % 5 == 0 ? "Buzz" : "";

    }
}
