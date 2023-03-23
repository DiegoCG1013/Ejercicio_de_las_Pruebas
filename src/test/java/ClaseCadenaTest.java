import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @Test
    void devuelveIniciales() {
        String resultado = ClaseCadena.devuelveIniciales("Juan Carlos");
        assertEquals("J.C.", resultado);
        String resultado2 = ClaseCadena.devuelveIniciales("12345664322");
        assertEquals("", resultado2);
        String resultado3 = ClaseCadena.devuelveIniciales("Juan Carlos 12345664322");
        assertEquals("", resultado3);
        String resultado4 = ClaseCadena.devuelveIniciales("123 456");
        assertEquals("", resultado4);

    }

    @Test
    void esLetra() {
        boolean resultado = ClaseCadena.esLetra('A');
        assertTrue(resultado);
        boolean resultado2 = ClaseCadena.esLetra('1');
        assertFalse(resultado2);
    }
}