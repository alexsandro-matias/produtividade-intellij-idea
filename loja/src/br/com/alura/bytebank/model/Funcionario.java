package br.com.alura.bytebank.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Funcionario {
    protected String usuario;
    protected String senha;
    private final String nome;
    private final int matricula;
    private final LocalDate dataNascimento;


    public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento + '}';
    }

    private int getIdade() {
        return LocalDateTime.now().getYear() - this.dataNascimento.getYear();
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, dataNascimento);
    }


    public boolean verificaIdade() {
        if (getIdade() >= 18) {
            System.out.println("é maior, já que a idade é " + getIdade() + " anos");
            return true;
        } else {
            System.out.println("é menor");
            return false;
        }
    }
}


