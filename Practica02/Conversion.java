import java.util.Scanner;

public class Conversion{

	public static double CelsiusFaren(double c){

		double r = (c*1.8)+32;

		return r;

	}

	public static double FarenCelsius(double f){

		double re = (f-32)/1.8;

		return re;

	}

	public static double KelvinCelcius(double k){

		double res = k - 273.15;

		return res;

	}

	public static double CelciusKelvin(double c){

		double resu = c + 273.15;

		return resu;

	}

	public static double FarenKelvin(double f){

		double resul = (f-32)*5/9 + 273.15;

		return resul;

	}

	public static double KelvinFaren(double k){

		double result = (k-273.15)*9/5+32;

		return result;

	}

	public static void main (String[] args){

		double resultadoConversion;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa que realiza las siguientes conversiones.");
		System.out.println("Selecciona la deseada:");

		System.out.println("a. Celsius -> Fahrenheit"); //CF
		System.out.println("b. Fahrenheit -> Celsius"); //FC
		System.out.println("c. Kelvin -> Celsius"); //KC
		System.out.println("d. Celsius -> Kelvin"); //CK
		System.out.println("e. Fahrenheit -> Kelvin"); //FK
		System.out.println("f. Kelvin -> Fahrenheit"); //KF

		char sel = entrada.next().toLowerCase().charAt(0);

		System.out.println("\nIngresa la cantidad de grados a convertir");

		switch(sel){

		case 'a':

			double CF = entrada.nextDouble();

			resultadoConversion = CelsiusFaren(CF);
			System.out.println("\nTus " + CF + "◦C equivalen a " + resultadoConversion + "◦F");

			break;

		case 'b':

			double FC = entrada.nextDouble();

			resultadoConversion = FarenCelsius(FC);
			System.out.println("\nTus " + FC + "◦F equivalen a " + resultadoConversion + "◦C");

			break;

		case 'c':

			double KC = entrada.nextDouble();

			resultadoConversion = KelvinCelcius(KC);
			System.out.println("\nTus " + KC + "◦K equivalen a " + resultadoConversion + "◦C");

			break;

		case 'd':

			double CK = entrada.nextDouble();

			resultadoConversion = CelciusKelvin(CK);
			System.out.println("\nTus " + CK + "◦C equivalen a " + resultadoConversion + "◦K");

			break;

		case 'e':

			double FK = entrada.nextDouble();

			resultadoConversion = FarenKelvin(FK);
			System.out.println("\nTus " + FK + "◦F equivalen a " + resultadoConversion + "◦K");

			break;

		case 'f':

			double KF = entrada.nextDouble();

			resultadoConversion = KelvinFaren(KF);
			System.out.println("\nTus " + KF + "◦K equivalen a " + resultadoConversion + "◦F");

			break;

		}

	}

}
