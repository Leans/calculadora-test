import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DivisionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void divisionPositivos() {
		System.out.println("Dividir dos numeros positivos");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "2";
		String resultadoObtenido = unaCalculadora.dividir(4, 2);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}
	
	@Test
	public void divisionNegativos() {
		System.out.println("Dividir dos numeros negativos");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "2";
		String resultadoObtenido = unaCalculadora.dividir(-4, -2);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}
	
	@Test
	public void divisionPositivoNegativos() {
		System.out.println("Dividir un numero positivo y un numero negativo");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "-2";
		String resultadoObtenido = unaCalculadora.dividir(4, -2);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}
	
	@Test
	public void divisionPorCero() {
		System.out.println("Dividir un numero por cero");
		Calculadora unaCalculadora = new Calculadora();
		String resultadoEsperado = "No se puede calcular una division por cero";
		String resultadoObtenido = unaCalculadora.dividir(2, 0);
		assertTrue(resultadoEsperado.equals(resultadoObtenido));		
	}

}
