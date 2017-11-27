//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.asserts.*;

public class RestarTest {
	
	Calculadora unaCalculadora;

	@Before
	public void setUp() throws Exception {
		unaCalculadora = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void restarPositivos() {
		int x = 5;
		int y = 3;
		String resta = unaCalculadora.restar(x, y);
		//assertTrue(resta.equals("2"));
		Assert.assertEquals("2", resta);
	}
	
	@Test
	public void restarNegativos() {
		int x = -5;
		int y = -3;
		String resta = unaCalculadora.restar(x, y);
		//assertTrue(resta.equals("-2"));
		Assert.assertEquals("-2", resta);
	}
	
	@Test
	public void restarPositivoNegativo() {
		int x = 5;
		int y = -3;
		String resta = unaCalculadora.restar(x, y);
		//assertTrue(resta.equals("8"));
		Assert.assertEquals("8", resta);
	}
	
	@Test
	public void restarNegativoPositivo() {
		int x = -5;
		int y = 3;
		String resta = unaCalculadora.restar(x, y);
		//assertTrue(resta.equals("-8"));
		Assert.assertEquals("-8", resta);
	}
	
	@Test
	public void restarPositivoCero() {
		int x = 5;
		int y = 0;
		String resta = unaCalculadora.restar(x, y);
//		assertTrue(resta.equals("5"));
		Assert.assertEquals("5", resta);
	}

}
