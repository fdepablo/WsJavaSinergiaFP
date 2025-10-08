
public class _02_Literales {

	public static void main(String[] args) {
		
		//Literales de cadena
		System.out.println("Esto es un literal de cadena");
		
		//Literales de caracter
		System.out.println('a');
		
		//Notese que podemos impmrimir "a" como cadena
		System.out.println("a");
		
		//Literal númerico entero (int)
		System.out.println(3);
		System.out.println(7);
		System.out.println(1 + 1);
		//Notese la diferencia con cadenas
		System.out.println("1" + "1");
		
		//Notese que el rango es importante
		//El rango de un entero es de 16 bits, si nos pasamos no nos vale
		//System.out.println(12345678901);
		
		//Literal númerico largo (long)
		//El rango es de 64 bits
		System.out.println(12345678901L);
		
		//Truco para numeros largos, poner "_" para agrupar
		System.out.println(1000000000000L);
		System.out.println(1_000_000_000_000L);
		
		//Literales booleanos
		System.out.println(true);
		System.out.println(false);
		
		//Literales punto flotante - tipo double (decimales)
		System.out.println(12.5);//notese el punto
		System.out.println(654.98);
		
		//Literales punto flotante - tipo float (rango es menor que double)
		System.out.println(12.5F);//se pone "F" al final
	}

}
