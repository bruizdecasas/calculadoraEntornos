package ed_calculadora;

public class Main {

	public static void main(String[] args) {
		
		
		// c�lculo del producto de dos n�meros reales
		Producto Pro1 = new Producto (4.2,2.2);
		
		// C�lculo del producto de dos n�meros enteros
		Producto Pro2 = new Producto (4,2);
		
		//C�lculo del producto de tres n�meros enteros
		
		Producto Pro3 =new Producto (2.3, 1.5, 2.4);
		
				
		//C�lculo de la potencia
		
		Producto Pro4 =new Producto (2,3);

		System.out.println ("M�TODOS DEL PRODUCTO-------------------------------------");
		System.out.println("el resultado del producto de " + Pro1.getNum1r() + " y " + Pro1.getNum2r() + " es: " + Pro1.Producto_real());
		System.out.println("el resultado del producto de " + Pro2.getNum1e() + " y " + Pro2.getNum2e() + " es: " + Pro2.Producto_entero());
		System.out.println("el resultado del producto de " + Pro3.getNum1r() + ", " + Pro3.getNum2r() + " y " + Pro3.getNum3r() + " es: " + Pro3.Producto_triple());
		System.out.println("el resultado de elevar " + Pro4.getNum1e() + " a " + Pro4.getNum2e()+ " es: " + Pro4.Potencia());
		System.out.println(" ");
		
				// c�lculo del cociente de dos n�meros reales
				Cociente Div1 = new Cociente (4.2,2.2);
				
				// C�lculo del cociente de dos n�meros enteros
				Cociente Div2 = new Cociente (4,2);
				
				//C�lculo del inverso
				
				Cociente Inver1 =new Cociente (2.3);
				
						
				//C�lculo de la ra�z cuadrada
				
				Cociente Raiz1 =new Cociente (2.3);

				System.out.println(Div1.Division_double());
				System.out.println(Div2.Division_int());
				System.out.println(Inver1.Inverso());
				System.out.println(Raiz1.Raiz());
	   	}

}
