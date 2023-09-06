import java.util.Scanner;

public class Figura{

	public static void main(String[] args){

		double pi = 3.1416;
		String figuraSel = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Este programa calcula superficies");
		System.out.println("Escoje la figura con la que quieres trabajar:");

		System.out.println("1. Cubo");
		System.out.println("2. Cilindro");
		System.out.println("3. Cono");

		int fig = sc.nextInt();

		if((fig < 1) || (fig > 3)){

			System.out.println("\nElección inválida\nAdiós");

		} else {

			if(fig == 1){

				figuraSel = "cubo";

			} else if(fig == 2){

				figuraSel = "cilindro";

			} else if(fig == 3){

				figuraSel = "cono";

			}//Fin if modifica msj

			System.out.println("\nAhora selecciona qué deseas sacar del " + figuraSel);

			System.out.println("1. Área Lateral");
			System.out.println("2. Área Total");
			System.out.println("3. Volumen");

			int calculo = sc.nextInt();

			if((calculo < 1) || (calculo > 3)){

			System.out.println("\nElección inválida\nAdiós");

			} else {

			switch(fig){

			//Cubo
			case 1:

				System.out.print("\nDame el valor del área: ");
				double valorA = sc.nextDouble();

				//Área Lateral
				if(calculo == 1){

					double cuboAL = 4*Math.pow(valorA,2);
					System.out.println("\nEl área lateral de un " + figuraSel + " de área " + valorA + " es *" + cuboAL + "*");

				//Área Total
				} else if(calculo == 2){

					double cuboAT = 6*Math.pow(valorA,2);
					System.out.println("\nEl área total de un " + figuraSel + " de área " + valorA + " es *" + cuboAT + "*");

				//Volumen
				} else if(calculo == 3){

					double cuboV = Math.pow(valorA,3);
					System.out.println("\nEl volumen de un " + figuraSel + " de área " + valorA + " es *" + cuboV + "*");

				}//Fin cálculo cubo

				break;

			//Cilindro
			case 2:

				System.out.print("\nDame el valor del radio: ");
				double radioCilindro = sc.nextDouble();

				System.out.print("Dame el valor de la altura: ");
				double alturaCilindro = sc.nextDouble();

				//Área Lateral
				if(calculo == 1){

					double cilindroAL = 2*pi*radioCilindro*alturaCilindro;

					System.out.println("\nEl área lateral de un " + figuraSel + " con radio " + radioCilindro + " y altura " + 
					alturaCilindro + " es *" + cilindroAL + "*");

				//Área Total
				} else if(calculo == 2){

					double suma = radioCilindro + alturaCilindro;
					double cilindroAT = 2*pi*suma;
					
					System.out.println("\nEl área total de un " + figuraSel + " con radio " + radioCilindro + " y altura " + 
					alturaCilindro + " es *" + cilindroAT + "*");

				//Volumen
				} else if(calculo == 3){

					double cilindroV = pi*Math.pow(radioCilindro, 2)*alturaCilindro;
					
					System.out.println("\nEl volumen de un " + figuraSel + " con radio " + radioCilindro + " y altura " + 
					alturaCilindro + " es *" + cilindroV + "*");

				}//Fin cálculo cilindro

				break;

			//Cono
			case 3:

				System.out.print("\nDame el valor del radio: ");
				double radioCono = sc.nextDouble();

				System.out.print("Dame el valor de la altura: ");
				double alturaCono = sc.nextDouble();

				System.out.print("Dame el valor de la generatriz: ");
				double gCono = sc.nextDouble();

				//Área Lateral
				if(calculo == 1){

					double conoAL = pi*radioCono*gCono;

					System.out.println("\nEl área lateral de un " + figuraSel + " con radio " + radioCono + ", altura " + 
					alturaCono + " y generatriz " + gCono + " es *" + conoAL + "*");

				//Área Total
				} else if(calculo == 2){

					double sumaDos = gCono + radioCono;
					double conoAT = pi*radioCono*sumaDos;

					System.out.println("\nEl área lateral de un " + figuraSel + " con radio " + radioCono + ", altura " + 
					alturaCono + " y generatriz " + gCono + " es *" + conoAT + "*");

				//Volumen
				} else if(calculo == 3){

					double div = pi*Math.pow(radioCono, 2)*alturaCono;
					double conoV = div/3;

					System.out.println("\nEl área lateral de un " + figuraSel + " con radio " + radioCono + ", altura " + 
					alturaCono + " y generatriz " + gCono + " es *" + conoV + "*");

				}//Fin cálculo cono

				break;

			}//Fin switch

			}//Fin if error cálculo

		}//Fin if error figura inválida

	}//Fin main

}//Fin class
