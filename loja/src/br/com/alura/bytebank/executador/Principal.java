package br.com.alura.bytebank.executador;


import br.com.alura.bytebank.model.Funcionario;
import br.com.alura.bytebank.model.Gerente;
import br.com.alura.bytebank.model.Vendedor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

    static void main() {
        Funcionario alexsandro = new Funcionario("Alexsandro", 4654654, LocalDate.of(1984, 10, 19));
        alexsandro.verificaIdade();
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(2020, 10, 12));

        Gerente joao = new Gerente("João", 123, LocalDate.of(1999, 12, 19));
        joao.setBonus(1500);

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(joao);
        lista.add(maria);
        lista.add(alexsandro);

        Vendedor vendedor = new Vendedor("João", 4654651, LocalDate.of(2000, 10, 10));

        boolean verificaIdade = vendedor.verificaIdade();

        System.out.println(verificaIdade);


        System.out.println(lista);


    }
}

