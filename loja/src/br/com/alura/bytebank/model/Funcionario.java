package br.com.alura.bytebank.model;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario {
    protected String usuario;
    protected String senha;
    private String nome;
    private int matricula;
    private LocalDate dataNascimento;


    public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula && Objects.equals(nome, that.nome) && Objects.equals(dataNascimento, that.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, dataNascimento);
    }

    public String getUsuario() {
        return usuario;
    }
}

