import java.util.Scanner;
import java.util.Random;

public class Ahorcado{

	public static String cartelera(int random){

	String pelicula = "";

	if(random == 0){

		pelicula = "avengers";

	} else if(random == 1){

		pelicula = "volver al futuro";

	} else if(random == 2){

		pelicula = "barbie";

	} else if(random == 3){

		pelicula = "batman";

	} else if(random == 4){

		pelicula = "star wars";

	} else if(random == 5){

		pelicula = "la sirenita";

	} else if(random == 6){

		pelicula = "lalaland";

	} else if(random == 7){

		pelicula = "el resplandor";

	} else if(random == 8){

		pelicula = "lilo y Stitch";

	} else if(random == 9){

		pelicula = "avatar";

	}

	return pelicula;

	}

	public static String imprimeRayitas(String pelicula){

		String espacios = "";
		String blankSpace = "  ";
		String rayitas = "_ ";

		for(int i = 0; i < pelicula.length(); i++){

			if(pelicula.charAt(i) != ' '){

				espacios += rayitas;

			} else {

				espacios += blankSpace;

			}

		}

		return espacios;	

	}

	public static String completa(String pelicula, char letra){

		String masLetras = "";
		String blankSpace = "  ";
		String rayitas = "_ ";
		//boolean contenido = false;

		for(int i = 0; i < pelicula.length(); i++){

			if(pelicula.charAt(i) == letra){

				//contenido = true;
				masLetras = masLetras + letra + " ";
				//System.out.print(letra + " ");

			} else if(pelicula.charAt(i) != ' '){

				masLetras += rayitas;
				//System.out.print("_ ");

			} else {

				masLetras += blankSpace;
				//System.out.print("  ");

			}

		}

		//System.out.println();

		return masLetras;

	}

	public static String rayitasLetras(String cadena1, String cadena2){

		String palabra = "";
		String blankSpace = "  ";
		String rayitas = "_ ";


		for(int i = 0; i < cadena2.length(); i++){

			for(int j = 0; j < cadena1.length(); j++){

				if(cadena2.charAt(i) == cadena1.charAt(j)){

					palabra += cadena2.charAt(j);

				}

			}

		}

		return palabra;

	}

public static void main(String[] args){

	Random rd = new Random();
	Scanner t = new Scanner(System.in);
	int quePelicula;
	int opcionUsuario;
	int contCompu = 0;
	int contJugador = 0;

	System.out.println("Bienvenido al juego de El Ahorcado");
	System.out.print("\nPor favor ingresa tu nombre: ");
	String nombre = t.nextLine();

	System.out.println("Ahora, selecciona la opción que desees");
	boolean centinela = true;
	int contadorJ = 0;

	while(centinela){

		quePelicula = rd.nextInt(10);

		String pelicula = cartelera(quePelicula);

		System.out.println("\n1. Jugar");
		System.out.println("2. Ver estadísticas");
		System.out.println("3. Salir");
		opcionUsuario = t.nextInt();

		byte usuarioG;
		byte compuG;

		switch(opcionUsuario){

		case 1:

			int perder = 6;

			contadorJ = contadorJ+1;

			System.out.println("Debes ingresar solo una letra, sin acentos");
			System.out.println("La película que tienes que adivinar es la siguiente:");
			System.out.println(pelicula); ////////////////////QUITAR ////////////////////
			System.out.println(imprimeRayitas(pelicula));
			System.out.println();

			while(perder > 0){

				System.out.println("Ingresa una letra");
				char letra = t.next().charAt(0);
				
				String cadena = completa(pelicula,letra);

				System.out.println(cadena); /////////QUITAR /////////

				}

			break;

		case 2:

			if(contadorJ == 0){

				System.out.println("\nAún no hay ningún juego registrado");

			} else {

				System.out.println("Total de juegos: " + contadorJ);
				System.out.println("Victorias de " + nombre + ": " +  contJugador);
				System.out.println("Victorias de la computadora : " + contCompu);

			}

			break;

		case 3:

			centinela = false;
			System.out.println("\nHasta luego " + nombre + ", gracias por ejecutar el programa :)");

			break;

		default:

			System.out.println("\nOpción incorrecta intenta de nuevo");

			break;

		}

	}//Fin while

	}//Fin main

}//Fin class
