package com.ditosoft.junit5app.ejemplos.models;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Eduardo",new BigDecimal("1000.12345"));
        String esperado = "Eduardo";
        String real = cuenta.getPersona();
        assertEquals(esperado,real);
        assertTrue(real.equals("Eduardo"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Eduardo", new BigDecimal("10000.12345"));
        assertEquals(10000.12345,cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
    }
}