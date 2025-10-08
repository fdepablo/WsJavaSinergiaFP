
public class _06_Conversiones {

	public static void main(String[] args) {
		int numeroEntero = 5;//asignamos a una varible int un literal int
		
		int numeroEntero2 = numeroEntero;//5
		
		double numeroDoble = 5.0;//asignamos a una variable double un literal double
		
		numeroDoble = 5;//asignamos a una variable de tipo double un literal de tipo
					//int. Aquí java hace una conversión automatica de int a double
					//porque sabe que un literal de tipo int SIEMPRE será más pequeño
					//que un literal de tipo double
		System.out.println(numeroDoble);//5.0
		
		//numeroEntero = 5.0;//Un literal de tipo double NO entra en una variable de 
						//tipo int
		
		long numeroLargo = 23;//Si
		//numeroEntero = 23L;//Un literal grande no entra en una variable mas pequeña
		
		//String cadena = 'c';//NO
		
		numeroDoble = 64.0;
		//numeroEntero = numeroDoble;
		//En java existen las conversiones automaticas o implicitas como hemos visto 
		//arriba. 
		//Pero también existen las conversiones explicitas o "casting"
		//El "casting" es una herramienta muy poderosa para los desarrolladores
		//con la cual, podemos forzar a convertir un tipo a otro sin importar
		//los tamaños de las variables
		//El casting se ejecuta en java mediante -> (tipo_varible)
		numeroEntero = (int)numeroDoble;
		System.out.println(numeroEntero);
		
		//Cuando hacemos una conversión forzosa puede ocurrir que perdamos
		//información
		numeroEntero = (int)64.6;
		System.out.println(numeroEntero);
		
		numeroEntero = (int)numeroLargo;
		System.out.println(numeroEntero);
		numeroEntero = (int)2_147_483_648L * 2;
		System.out.println(numeroEntero);
		
		//numeroEntero = (int)false;
		float numeroFloat = (float)32.6;
		System.out.println(numeroFloat);
		
		//Casos especiales
		numeroEntero = 'a';
		System.out.println(numeroEntero);//97 es el codigo ascii de la 'a'
		
		
	}
}
