package ed_calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
 * <br>
 * Esta clase tendrá los siguientes métodos:
 * <br>
 * <b>Producto dos números reales.</b>.
 * <br>
 * <b>Producto dos números enteros.</b>
 * <br>
 * <b>Producto de tres números reales.</b>
 * <br>
 * <b>Potencia.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitierán números negativos</b> habría que especificarlo al usuario 
 *   y además utilizar un if para en el caso de que lo pusiera le indicara el método que debe ser 
 *   un número mayor o igual que cero.
 * <br>
 * - En el producto <b>no pasaría nada sí </b>alguno de los parámetros fuera <b>cero</b>.
 * <br>
 * - En la potencia:
 * 		1) La base es cero, el resultado es cero.
 * 		2) Si el exponente es cero el resultado es uno.
 *      3) Si <b>ambos son cero</b> sería una <b>indeterminación</b>.
 * <br>
 * - La entrada de <b>números muy grandes en la potencia </b> puede ser un problema a la hora de devolver el resultado, 
 *   para solucionarlo, utilizaremos un while que cuando el resultado tenga más de 7 cifras, la calculadora 
 *   muestre el número empleando la <b>notación científica</b> con la forma aEb, donde a sería el número y b el exponente 
 *   de la base 10.
 * <br>
 * <ul>
 * 
 * 
 * @authors Benjamin Ruiz de Casas
 * @version 2.0
 *
 */

public class Producto {
	private double num1;
	private double num11;
	private int num2;
	private int num21;
	private double num3;
	private double num31;
	private double num32;
	private int base;
	private int exponente;
	
	public Producto (double num1, double num11){
		this.num1 = num1;
		this.num11 = num11;
	}
	public Producto (int num2, num21) {
		this.num2 = num2;
		this.num21 = num21;
	}
	public Producto (double num3, double num31, double 32) {
		this.num3=num3;
		this.num31=num31;
		this.num32=num32;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1 (double num1) {
		this.num1 = num1;
	}
	public double getNum11() {
		return num1;
	}
	public void setNum11 (double num11) {
		this.num1 = num11;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2 (int num2) {
		this.num2 = num2;
	}
	public int getNum21() {
		return num2;
	}
	public void setNum21 (int num21) {
		this.num21 = num21;
	}
	public double getNum3() {
		return num3;
	}
	public void setNum3 (double num3) {
		this.num3 = num3;
	}
	public double getNum31() {
		return num31;
	}
	public void setNum31 (double num31) {
		this.num31 = num31;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum32 (double num32) {
		this.num32 = num32;
	}
	/**
	 * Se crea el método para calcular el producto de dos números reales.
	 * 
	 * @param num1 número real que es uno de los factores.
	 * @param num11 número real que es otro de los factores.
	 * @return Devuelve el resultado del producto.
	 */

	public double Producto_real (double num1, double num11) {
		double Resultado = num1*num11;
		return Resultado;
	}

	/**
	 * Se crea el método para calcular el producto de dos números enteros.
	 * 
	 * @param num2 número entero que es uno de los factores.
	 * @param num21 número entero que es otro de los factores.
	 * @return Devuelve el resultado del producto de ambos factores.
	 */
	public int Producto_entero (int num2, int num21) {
		double Resultado = num2*num21;
		return Resultado;
		
	}

	/**
	 * Se crea el método para calcular el producto de tres números reales.
	 * 
	 * @param num3 número real que es el factor uno.
	 * @param num31 número real que es el factor dos.
	 * @param num32 número real que es el factor tres.
	 * @return Devuelve el resultado del producto de los tres factores.
	 */
	public double Producto_triple (double num3, double num31, double num32) {
		double Resultado = num3*num31*num32;
		return Resultado;	
	}

	/**
	 * Se crea el método para calcular la potencia de un número.
	 * 
	 * @param base número entero o real que representa la base de la potencia.
	 * @param exponente número entero o real que representa el exponente de la potencia.
	 * 
	 * @throws - La base y el exponente no pueden ser cero simultáneamente.
	 * 
	 * @return Devuelve el resultado de la potencia.
	 */
	public double Potencia (int base, int exponente) {
		double Resultado = Math.pow(base, exponente);
		return Resultado;
	}
}
