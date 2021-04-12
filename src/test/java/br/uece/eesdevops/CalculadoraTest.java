package br.uece.eesdevops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomaPrimo() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somarPrimo();
		assertEquals(1060, resultado);
	}

}
