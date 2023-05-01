package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {


    public static void main(String[] args) {
        Funcionario alexsandro = new Funcionario("José", 4654654, LocalDate.of(1984, 10, 19));
        System.out.println(alexsandro);

        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(2020,10,12));

        System.out.println(maria);
    }
}

