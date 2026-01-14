package clases;

public class Main {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		int numero = 5;
		
		c1.marca = "Toyota";
		c1.modelo = "Corolla";
		c1.matricula = "6789CMX";
		c1.peso = 1345;
		c1.aniosDeAntiguedad = 10;
		c1.esElectrico = false;
		
		//c1.modelo = "Celica";
		
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.matricula);
		System.out.println(c1.peso);
		System.out.println(c1.aniosDeAntiguedad);
		System.out.println(c1.esElectrico);
		
		System.out.println("-------------------");
		
		Coche c2 = new Coche();
				
		c2.marca = "MG";
		c2.modelo = "GT6";
		c2.matricula = "1234TMB";
		c2.peso = 2500;
		c2.aniosDeAntiguedad = 6;
		c2.esElectrico = false;
		
		System.out.println(c2.marca);
		System.out.println(c2.modelo);
		System.out.println(c2.matricula);
		System.out.println(c2.peso);
		System.out.println(c2.aniosDeAntiguedad);
		System.out.println(c2.esElectrico);
		
		Animal cucaracha = new Animal();
		cucaracha.clase = "Insecto";
		
		String[] dietaDeCucaracha = new String[2];
		dietaDeCucaracha[0] = "Mantequilla";
		dietaDeCucaracha[1] = "Remolacha";
		
		cucaracha.dieta = dietaDeCucaracha;
		cucaracha.numeroDePatas = 5;//Ya no puede caminar
		cucaracha.esDomestico = false;
		cucaracha.peso = 0.05;//porque le falta la patita de atras
		
		Movil aiFoneCatorce = new Movil();
		aiFoneCatorce.sistemaOperativo = "Android 13";
		aiFoneCatorce.tamanio = 1600;
		aiFoneCatorce.tieneCamaraSelfie = true;
		aiFoneCatorce.peso = 125;
	}

}
