import java.util.Scanner;

public class Figura{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa que imprime una figura dado un valor de base mínimo de *3*");
        System.out.print("Ingresa el valor de la línea horizontal para crear una figura: ");

        int altura = teclado.nextInt();
        System.out.println();

        if(altura < 3){

            altura = 3;

            System.out.println("El valor mínimo es de 3 y su figura es:\n");

        }

        for(int i = 1; i <= altura; i++){

            for (int j = 1; j <= i; j++){

                System.out.print("*");

            }

            for(int j = 1; j <= (altura-i)*2; j++){

                System.out.print(" ");

            }

            for(int j = 1; j <= i; j++){

                System.out.print("*");

            }

            System.out.println("");
        }
    }
}
