import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestarTest {
	
	Calculadora unaCalculadora = new Calculadora();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void restarPositivos() {
		int x = 5;
		int y = 3;
		String resta = unaCalculadora.restar(x, y);
		assertTrue(resta.equals("2"));
	}
	
	@Test
	public void restarNegativos() {
		int x = -5;
		int y = -3;
		String resta = unaCalculadora.restar(x, y);
		assertTrue(resta.equals("-2"));
	}
	
	@Test
	public void restarPositivoNegativo() {
		int x = 5;
		int y = -3;
		String resta = unaCalculadora.restar(x, y);
		assertTrue(resta.equals("8"));
	}
	
	@Test
	public void restarNegativoPositivo() {
		int x = -5;
		int y = 3;
		String resta = unaCalculadora.restar(x, y);
		assertTrue(resta.equals("-8"));
	}
	

}
