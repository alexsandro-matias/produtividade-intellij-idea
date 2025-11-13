package br.com.alura.bytebank.tests;

import br.com.alura.bytebank.model.Funcionario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class FuncionarioTest {
    @Test
    void verificaIdade() {
        Funcionario funcionario = new Funcionario("sandro", '6', LocalDate.of(1999, 10, 01));
        boolean verificaIdade = funcionario.verificaIdade();
        Assert.assertTrue(verificaIdade);
    }

}
