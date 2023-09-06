import java.util.Scanner;

public class Puntos{

	public static double CalculaDistancia(double Xn, double Yn, double Xm, double Ym){

		double restaX = (Xm - Xn);

		double restaY = (Ym - Yn);

		double exp = (Math.pow(restaX,2)) + (Math.pow(restaY,2)); 

		double answ = Math.sqrt(exp); //Respuesta final

		return answ;

	}//Fin método CalculaDistancia

	public static void main (String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.println("Programa que calcula la distancia mínima dados 5 coordenadas");

		System.out.print("\nIngresa el valor de x1: ");
		double x1 = teclado.nextDouble();

		System.out.print("Ingresa el valor de y1: ");
		double y1 = teclado.nextDouble();

		System.out.print("Ingresa el valor de x2: ");
		double x2 = teclado.nextDouble();

		System.out.print("Ingresa el valor de y2: ");
		double y2 = teclado.nextDouble();

		System.out.print("Ingresa el valor de x3: ");
		double x3 = teclado.nextDouble();

		System.out.print("Ingresa el valor de y3: ");
		double y3 = teclado.nextDouble();

		System.out.print("Ingresa el valor de x4: ");
		double x4 = teclado.nextDouble();

		System.out.print("Ingresa el valor de y4: ");
		double y4 = teclado.nextDouble();

		System.out.print("Ingresa el valor de x5: ");
		double x5 = teclado.nextDouble();

		System.out.print("Ingresa el valor de y5: ");
		double y5 = teclado.nextDouble();

		System.out.println("\nLas coordenadas quedaron de la siguiente manera: ");
		System.out.println("P1 = (" + x1 + " , " + y1 + ")");
		System.out.println("P2 = (" + x2 + " , " + y2 + ")");
		System.out.println("P3 = (" + x3 + " , " + y3 + ")");
		System.out.println("P4 = (" + x4 + " , " + y4 + ")");
		System.out.println("P5 = (" + x5 + " , " + y5 + ")");

		//Calculamos la distancias
		String concat;
		double distanciaMenor;
		double distanciaTemporalP1;
		double distanciaTemporalP2;
		double distanciaTemporalP3;
		double distanciaTemporalP4;
		double distanciaTemporalP5;
		String distanciaMenorImpresa;

		//Calculamos del P1 al P2, P3, P4 y P5
		double P1aP2 = CalculaDistancia(x1,y1,x2,y2);
		double P1aP3 = CalculaDistancia(x1,y1,x3,y3);
		double P1aP4 = CalculaDistancia(x1,y1,x4,y4);
		double P1aP5 = CalculaDistancia(x1,y1,x5,y5);

		distanciaTemporalP1 = P1aP2;
		concat = "al Punto 2";

		if(P1aP3 < P1aP2){

			distanciaTemporalP1 = P1aP3;
			concat = "al Punto 3";

		} else if(P1aP4 < P1aP2){

			distanciaTemporalP1 = P1aP4;
			concat = "al Punto 4";

		} else if(P1aP5 < P1aP2){

			distanciaTemporalP1 = P1aP5;
			concat = "al Punto 5";

		}

		//Calculamos del P2 al P1, P3, P4 y P5
		double P2aP1 = CalculaDistancia(x2,y2,x1,y1);
		double P2aP3 = CalculaDistancia(x2,y2,x3,y3);
		double P2aP4 = CalculaDistancia(x2,y2,x4,y4);
		double P2aP5 = CalculaDistancia(x2,y2,x5,y5);

		distanciaTemporalP2 = P2aP1;
		concat = "al Punto 1";

		if(P2aP3 < P1aP3){

			distanciaTemporalP2 = P2aP3;
			concat = "al Punto 3";

		} else if(P2aP4 < P1aP3){

			distanciaTemporalP2 = P2aP4;
			concat = "al Punto 4";

		} else if(P2aP5 < P1aP3){

			distanciaTemporalP2 = P2aP5;
			concat = "al Punto 5";

		}

		//Calculamos del P3 al P1, P2, P4 y P5
		double P3aP1 = CalculaDistancia(x3,y3,x1,y1);
		double P3aP2 = CalculaDistancia(x3,y3,x2,y2);
		double P3aP4 = CalculaDistancia(x3,y3,x4,y4);
		double P3aP5 = CalculaDistancia(x3,y3,x5,y5);

		distanciaTemporalP3 = P3aP1;
		concat = "al Punto 1";

		if(P3aP2 < P3aP1){

			distanciaTemporalP3 = P3aP2;
			concat = "al Punto 2";

		} else if(P3aP4 < P3aP1){

			distanciaTemporalP3 = P3aP4;
			concat = "al Punto 4";

		} else if(P3aP5 < P3aP1){

			distanciaTemporalP3 = P3aP5;
			concat = "al Punto 5";

		}

		//Calculamos del P4 al P1, P2, P3 y P5
		double P4aP1 = CalculaDistancia(x4,y4,x1,y1);
		double P4aP2 = CalculaDistancia(x4,y4,x2,y2);
		double P4aP3 = CalculaDistancia(x4,y4,x3,y3);
		double P4aP5 = CalculaDistancia(x4,y4,x5,y5);

		distanciaTemporalP4 = P4aP1;
		concat = "al Punto 1";

		if(P4aP2 < P4aP1){

			distanciaTemporalP4 = P4aP2;
			concat = "al Punto 2";

		} else if(P4aP3 < P4aP1){

			distanciaTemporalP4 = P4aP3;
			concat = "al Punto 3";

		} else if(P4aP5 < P4aP1){

			distanciaTemporalP4 = P4aP5;
			concat = "al Punto 5";

		}

		//Calculamos del P5 al P1, P2, P3 y P4
		double P5aP1 = CalculaDistancia(x5,y5,x1,y1);
		double P5aP2 = CalculaDistancia(x5,y5,x2,y2);
		double P5aP3 = CalculaDistancia(x5,y5,x3,y3);
		double P5aP4 = CalculaDistancia(x5,y5,x4,y4);

		distanciaTemporalP5 = P5aP1;
		concat = "al Punto 1";

		if(P5aP2 < P5aP1){

			distanciaTemporalP5 = P5aP2;
			concat = "al Punto 2";

		} else if(P5aP3 < P5aP1){

			distanciaTemporalP5 = P5aP3;
			concat = "al Punto 3";

		} else if(P5aP4 < P5aP1){

			distanciaTemporalP5 = P5aP4;
			concat = "al Punto 4";

		}

		distanciaMenorImpresa = "del Punto 1 ";

		if(distanciaTemporalP2 < distanciaTemporalP1){

			distanciaMenorImpresa = "del Punto 2 ";

		} else if(distanciaTemporalP3 < distanciaTemporalP1){

			distanciaMenorImpresa = "del Punto 3 ";

		} else if(distanciaTemporalP4 < distanciaTemporalP1){

			distanciaMenorImpresa = "del Punto 4 ";

		} else if(distanciaTemporalP5 < distanciaTemporalP1){

			distanciaMenorImpresa = "del Punto 5 ";

		}

		//Determinamos la distancia menor de todas
		distanciaMenor = distanciaTemporalP1;

		if(distanciaTemporalP2 < distanciaTemporalP1){

			distanciaMenor = distanciaTemporalP2;

		} else if(distanciaTemporalP3 < distanciaTemporalP1){

			//var = "la distaNcia del P1 AL p3";

			distanciaMenor = distanciaTemporalP3;

		} else if(distanciaTemporalP4 < distanciaTemporalP1){

			distanciaMenor = distanciaTemporalP4;

		} else if(distanciaTemporalP5 < distanciaTemporalP1){

			distanciaMenor = distanciaTemporalP5;

		}

		System.out.println();
		System.out.println("La menor distancia es la " + distanciaMenorImpresa + concat + " con distancia "  + distanciaMenor);

	}//Fin main

}//Fin class
