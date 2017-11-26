import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumaPositivos() {
		System.out.println("Suma dos numeros positivos");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "5";
		String resultadoObtenido = unaCalculadora.sumar(2, 3);
		System.out.println(resultadoObtenido);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));
	}
	
	@Test
	public void sumaNegativos() {
		System.out.println("Suma dos numeros negativos");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "-5";
		String resultadoObtenido = unaCalculadora.sumar(-2, -3);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));
	}
	
	@Test
	public void sumaPositivoNegativo() {
		System.out.println("Suma un numero positivo y un numero negativo");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "-1";
		String resultadoObtenido = unaCalculadora.sumar(2, -3);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}
	
	

}
