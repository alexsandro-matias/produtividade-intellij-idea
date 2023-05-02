package br.com.alura.bytebank.model.test;

import br.com.alura.bytebank.model.Gerente;

import java.time.LocalDate;

class GerenteTest {

    @org.junit.jupiter.api.Test
    void getBonus() throws IllegalArgumentException {
        Gerente gerente = new Gerente("Alexsandro", 11, LocalDate.of(2000, 10, 19));
        gerente.setBonus(1000);
    }
}