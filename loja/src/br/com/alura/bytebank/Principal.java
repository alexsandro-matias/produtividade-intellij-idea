package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;
import br.com.alura.bytebank.model.Gerente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        Funcionario alexsandro = new Funcionario("Alexsandro", 4654654, LocalDate.of(1984, 10, 19));

        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(2020, 10, 12));

        Gerente joao = new Gerente("João", 123, LocalDate.of(1999, 12, 19));
        joao.setBonus(1500);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(joao);
        lista.add(maria);
        lista.add(alexsandro);

        for (Funcionario funcionario :
                lista) {
            System.out.println(funcionario);
        }
    }
}

