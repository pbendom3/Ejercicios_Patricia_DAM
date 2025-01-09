package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TablaMultiplicarTest {

    @Test
    void validarTabla() {

        assertAll(
                () -> assertTrue(TablaMultiplicar.validarTabla(7)),
                () -> assertTrue(TablaMultiplicar.validarTabla(5)),
                () -> assertFalse(TablaMultiplicar.validarTabla(-3)),
                () -> assertFalse(TablaMultiplicar.validarTabla(37))
        );

    }

    @Test
    void calcularCuadrado() {

        assertAll(
                () -> assertEquals(64,TablaMultiplicar.calcularCuadrado(8)),
                () -> assertEquals(9, TablaMultiplicar.calcularCuadrado(3))

        );

    }


}