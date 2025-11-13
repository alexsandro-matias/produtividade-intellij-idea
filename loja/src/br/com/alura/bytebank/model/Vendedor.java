package br.com.alura.bytebank.model;
import java.time.LocalDate;

import br.com.alura.bytebank.model.Funcionario;


public class Vendedor extends Funcionario {


    public Vendedor(String nome, int matricula, LocalDate dataNascimento) {
        super(nome, matricula, dataNascimento);
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
