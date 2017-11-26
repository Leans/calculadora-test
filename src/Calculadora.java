
public class Calculadora {
	private int x;
	private int y;
	
	/*
	 * Constructor de Calculadora. No recive parametros de entrada.
	 */
	public Calculadora () {		
	}
	/*
	 * Constructor de Calculadora. Recive dos parametros (int) de entrada: x e y.
	 */
	public Calculadora (int p_x, int p_y) {
		this.setX(p_x);
		this.setY(p_y);
	}
	
	//Setters
	private void setX(int p_x) {
		this.x=p_x;
	}
	private void setY(int p_y) {
		this.y=p_y;
	}
	//Getters
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	/*
	 * Metodo para sumar dos numeros enteros, Devuelve un string con el resultado de la suma.
	 */
	public String sumar(int p_x, int p_y) {		
		return String.valueOf(p_x + p_y);
	}
	
	/*
	 * Metodo para dividir dos numeros enteros, Devuelve un string con el resultado de la division.
	 */
	public String dividir(int p_x, int p_y) {
		String resultado;
		if (p_y != 0) {
			resultado = String.valueOf(p_x / p_y);
		} else {
			resultado = "No se puede calcular una division por cero";
		}
		return resultado;
	}
	
}
