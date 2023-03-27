package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Funcionario jose = new Funcionario("José", 4654654, LocalDate.of(1984, 10, 19));
        System.out.println(jose);


    }
}
// TODO: 27/03/2023 - procurar como ler um arquivo em pdf

