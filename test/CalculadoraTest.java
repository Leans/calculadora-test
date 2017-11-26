import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora unaCalculadora = new Calculadora();
	
	@Before
	public void setUp() throws Exception {		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumaPositivos() {
		System.out.println("Suma dos numeros positivos");
		
		String resultadoEsperado = "5";
		String resultadoObtenido = unaCalculadora.sumar(2, 3);
		System.out.println(resultadoObtenido);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));
	}
	
	@Test
	public void sumaNegativos() {
		System.out.println("Suma dos numeros negativos");
		String resultadoEsperado = "-5";
		String resultadoObtenido = unaCalculadora.sumar(-2, -3);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));
	}
	
	@Test
	public void sumaPositivoNegativo() {
		System.out.println("Suma un numero positivo y un numero negativo");
		String resultadoEsperado = "-1";
		String resultadoObtenido = unaCalculadora.sumar(2, -3);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}
	
	

}
