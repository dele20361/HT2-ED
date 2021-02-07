import junit.framework.TestCase;

public class OperacionesJUnit extends TestCase {
	
	private Operaciones op;
	
	public void Test() {
		op = new Operaciones();
		
	}

	public void testSuma() {
		Test();
		assertTrue(op.suma(2, 2)==4);
	}

	public void testResta() {
		Test();
		assertTrue(op.resta(2, 2)==0);
	}

	public void testMultiplicacion() {
		Test();
		assertTrue(op.multiplicacion(2, 2)==4);
	}

	public void testDivision() {
		Test();
		assertTrue(op.division(4, 2)==2);
	}

}
