package ed_calculadora;

public class Main {

	public static void main(String[] args) {
		
		
		// cálculo del producto de dos números reales
		Producto Pro1 = new Producto (4.2,2.2);
		
		// Cálculo del producto de dos números enteros
		Producto Pro2 = new Producto (4,2);
		
		//Cálculo del producto de tres números enteros
		
		Producto Pro3 =new Producto (2.3, 1.5, 2.4);
		
				
		//Cálculo de la potencia
		
		Producto Pro4 =new Producto (2,3);

		System.out.println ("MÉTODOS DEL PRODUCTO-------------------------------------");
		System.out.println("el resultado del producto de " + Pro1.getNum1r() + " y " + Pro1.getNum2r() + " es: " + Pro1.Producto_real());
		System.out.println("el resultado del producto de " + Pro2.getNum1e() + " y " + Pro2.getNum2e() + " es: " + Pro2.Producto_entero());
		System.out.println("el resultado del producto de " + Pro3.getNum1r() + ", " + Pro3.getNum2r() + " y " + Pro3.getNum3r() + " es: " + Pro3.Producto_triple());
		System.out.println("el resultado de elevar " + Pro4.getNum1e() + " a " + Pro4.getNum2e()+ " es: " + Pro4.Potencia());
		System.out.println(" ");
		
				// cálculo del cociente de dos números reales
				Cociente Div1 = new Cociente (4.2,2.2);
				
				// Cálculo del cociente de dos números enteros
				Cociente Div2 = new Cociente (4,2);
				
				//Cálculo del inverso
				
				Cociente Inver1 =new Cociente (2.3);
				
						
				//Cálculo de la raíz cuadrada
				
				Cociente Raiz1 =new Cociente (2.3);

				System.out.println(Div1.Division_double());
				System.out.println(Div2.Division_int());
				System.out.println(Inver1.Inverso());
				System.out.println(Raiz1.Raiz());
	   	}

}
