import java.util.Scanner;

public class Radianes{

public static void main(String[] args){

  double pi = Math.PI;
  double usoRadian = 180/pi;
  double usoGrados = pi/180;

	Scanner sc = new Scanner(System.in);

	System.out.println("Este programa convierte de radianes a grados y viceversa");
	System.out.println("Deseas convertir:");
	System.out.println("1. Radianes --> Grados");
	System.out.println("2. Grados --> Radianes");

	int op = sc.nextInt();

	switch(op){

	case 1:

    System.out.println("Ingresa los radianes: ");
    double radianes = sc.nextDouble();

    double resultadoR = radianes*usoRadian;
    System.out.println("\n" + radianes + " radianes equivalen a " + resultadoR + "°");
    
		break;

	case 2:

	System.out.println("Ingresa los grados");
  	double grados = sc.nextDouble();

  	double resultadoG = grados*usoGrados;

  	System.out.println("\n" + grados + " ° equivalen a " + resultadoG + " radianes");

		break;

	default:

		System.out.println("\nEsa opción no existe");

		}//Fin switch menú

	}//Fin main

}//Fin class
