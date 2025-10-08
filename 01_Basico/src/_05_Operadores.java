
public class _05_Operadores {
	/*
	   Operadores
	   ----------
		Los operadores son símbolos especiales que por lo común se utilizan en expresiones.
		
		Según su naturaleza pueden representar multiples objetivos.
	
	   Expresión
	   ---------
		Una expresión es una combinación de variables, operadores o llamadas a 
		métodos.
	
		El tipo de dato del valor regresado por una expresión depende de los 
		elementos usados en la expresión.
		 */
	public static void main(String[] args) {
	
		//Operadores aritmeticos
		System.out.println(5 + 7);//12
		System.out.println(5 - 3);//2
		System.out.println(5 * 3);//15
		System.out.println(3 -10);// -7
		
		//Dividir enteros, siempre devuelve entero
		System.out.println(15 / 3);//5
		System.out.println(15 / 2);//7, elimina los decimales
		System.out.println(10 / 9);//1
		
		//si queremos decimales, algún número debe de ser decimal
		System.out.println(15.0 / 3);//5.0
		System.out.println(15 / 2.0);//7.5
		System.out.println(10.0 / 9.0);//1.1111111111111112
		
		//Modulo. Es el resto de la división entera
		System.out.println(15 / 3);//nominador: 15, denominador: 3, cociente: 5 resto:0
		System.out.println(15 / 2);//nominador: 15, denominador: 2, cociente: 7 resto:1
		System.out.println(10 / 9);//nominador: 10, denominador: 9, cociente: 1 resto:1
		
		//Para el modulo se usa el %
		System.out.println(15 % 3);//0
		System.out.println(15 % 2);//1
		System.out.println(10 % 9);//1
		
		int edad = 50;
		if(edad % 2 == 0) System.out.println("Es par");
		
		// Operadores de asignación
		// =, sirve para asignar un valor
		int n1 = 2;
		
		//Acumuladores, muy utilizados. Un acumulador es una variable a la 
		//que vamos incrementado otro valor que no tiene porque ser fijo
		n1 = n1 + 5;//7
		n1 = n1 + 7;//14
		
		int n2 = 9;
		n2 = n2 + 6;//15
		n2 = n2 + 9;//24
		
		//los acumuladores tienen su propios operadores
		int n3 = 9;
		n3 += 6;//equivalente a n3 = n3 + 6; 15
		n3 += 9;//equivalente a n3 = n3 + 9; 24
		
		int n4 = 5;
		n4 += 4;//9
		n4 += 6;//15
		n4 += 3;//18
				
		//Existen otras variantes
		int n5 = 4;
		n5 -= 3;//equivalente n5 = n5 - 3;1
		n5 -= 5;//-4
				
		int n6 = 5;
		n6 *= 5;//25
		n6 *= 2;//50
		
		int n7 = 6;
		n7 += 5;//11
		n7 -= 7;//4
		n7 *= 3;//12
		
		//Incrementales, solo aumentan el valor en una unidad
		//se usa el operador "++"
		int n8 = 1;
		n8++;//n8 = n8 +1; 2
		n8++;//3
		n8 += 5;//8
		n8++;//9
		
		//Decrementales, restan una unidad al valor, se usa 
		//el operador "--"
		int n9 = 5;
		n9--;//4
		n9++;//5
		n9 *= 5;//25
		n9--;//24
		n9--;//23
		
		//OJO! donde situamos los operadores
		int n10 = 1;
		n10++;
		System.out.println(n10);
		System.out.println(n10++);
		System.out.println(n10);
		
		int n11 = 5;
		System.out.println(n11);
		System.out.println(++n11);
		
		//Operadores relacionales
		//Son operadores que comparan variables o literales o expresiones
		// y siempre devuelven un valor boolean
		
		//operador de igualdad
		System.out.println(6 == 7);
		System.out.println(n8 == n9);
		System.out.println(n8 == 7);
		
		//mayor o igual
		System.out.println(6 >= 7);
		System.out.println(n8 >= n9);
		System.out.println(n8 >= 7);
		
		//menor o igual
		System.out.println(6 <= 7);
		System.out.println(n8 <= n9);
		System.out.println(n8 <= 7);
		
		//menor
		System.out.println(6 < 7);
		System.out.println(n8 < n9);
		System.out.println(n8 < 7);
		
		//mayor
		System.out.println(6 > 7);
		System.out.println(n8 > n9);
		System.out.println(n8 > 7);
		
		//Distinto o diferente
		System.out.println(6 != 7);
		System.out.println(n8 != n9);
		System.out.println(n8 != 7);
		
		//Agrupación -> ()
		System.out.println(10 + 5 * 5);//35
		System.out.println((10 + 5) * 5);//75
		
		//Operadores lógicos
		//Son operadores que se usan para comparar expresiones booleanas
		//y devuelven un valor booleanos
		
		//AND -> devuelve true cuando las dos expresiones son true, false
		//en el resto de los casos, se usa el operador "&&"
		System.out.println((9 > 8) && (9 < 10));//true
		System.out.println(n8 == 8 && n9 < 10);
		System.out.println(n8 == 8 && n9 < 10 && n10 > 45);
		
		//OR -> devuelve true cuando una de las dos expresiones es true, false
		//cuando las dos son false, se usa el operador "||"
		System.out.println((9 > 8) || (9 < 10));//true
		System.out.println(n8 == 8 || n9 < 10);
		System.out.println(n8 == 8 || n9 < 10 && n10 > 45);
		
		//Negacion -> devuelve true si la expresion es false y devuelve
		//false si la expresion es true
		System.out.println(!false);//true
		System.out.println(!(9 < 8));//true
		
		//Operador concatenación. Solo para cadenas. Se usa el mismo
		//operador que el operador suma aritmetica, es decir "+"
		
		String cadena1 = "Hola";
		String cadena2 = "Caracola";
		String cadena3 = cadena1 + cadena2;
		System.out.println(cadena3);
		String cadena4 = cadena1 + " " + cadena2;
		System.out.println(cadena4);
		
		System.out.println("Hola " + "Caracola");
		System.out.println(5 + 5);
		System.out.println("5" + "5");
		
	}

}
