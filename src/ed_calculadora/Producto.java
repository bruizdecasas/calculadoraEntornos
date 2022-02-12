package ed_calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la multiplicaci�n de la calculadora.
 * <br>
 * Esta clase tendr� los siguientes m�todos:
 * <br>
 * <b>Producto dos n�meros reales.</b>.
 * <br>
 * <b>Producto dos n�meros enteros.</b>
 * <br>
 * <b>Producto de tres n�meros reales.</b>
 * <br>
 * <b>Potencia.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitier�n n�meros negativos</b> habr�a que especificarlo al usuario 
 *   y adem�s utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser 
 *   un n�mero mayor o igual que cero.
 * <br>
 * - En el producto <b>no pasar�a nada s� </b>alguno de los par�metros fuera <b>cero</b>.
 * <br>
 * - En la potencia:
 * 		1) La base es cero, el resultado es cero.
 * 		2) Si el exponente es cero el resultado es uno.
 *      3) Si <b>ambos son cero</b> ser�a una <b>indeterminaci�n</b>.
 * <br>
 * - La entrada de <b>n�meros muy grandes en la potencia </b> puede ser un problema a la hora de devolver el resultado, 
 *   para solucionarlo, utilizaremos un while que cuando el resultado tenga m�s de 7 cifras, la calculadora 
 *   muestre el n�mero empleando la <b>notaci�n cient�fica</b> con la forma aEb, donde a ser�a el n�mero y b el exponente 
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
	 * Se crea el m�todo para calcular el producto de dos n�meros reales.
	 * 
	 * @param num1 n�mero real que es uno de los factores.
	 * @param num11 n�mero real que es otro de los factores.
	 * @return Devuelve el resultado del producto.
	 */

	public double Producto_real (double num1, double num11) {
		double Resultado = num1*num11;
		return Resultado;
	}

	/**
	 * Se crea el m�todo para calcular el producto de dos n�meros enteros.
	 * 
	 * @param num2 n�mero entero que es uno de los factores.
	 * @param num21 n�mero entero que es otro de los factores.
	 * @return Devuelve el resultado del producto de ambos factores.
	 */
	public int Producto_entero (int num2, int num21) {
		double Resultado = num2*num21;
		return Resultado;
		
	}

	/**
	 * Se crea el m�todo para calcular el producto de tres n�meros reales.
	 * 
	 * @param num3 n�mero real que es el factor uno.
	 * @param num31 n�mero real que es el factor dos.
	 * @param num32 n�mero real que es el factor tres.
	 * @return Devuelve el resultado del producto de los tres factores.
	 */
	public double Producto_triple (double num3, double num31, double num32) {
		double Resultado = num3*num31*num32;
		return Resultado;	
	}

	/**
	 * Se crea el m�todo para calcular la potencia de un n�mero.
	 * 
	 * @param base n�mero entero o real que representa la base de la potencia.
	 * @param exponente n�mero entero o real que representa el exponente de la potencia.
	 * 
	 * @throws - La base y el exponente no pueden ser cero simult�neamente.
	 * 
	 * @return Devuelve el resultado de la potencia.
	 */
	public double Potencia (int base, int exponente) {
		double Resultado = Math.pow(base, exponente);
		return Resultado;
	}
}
