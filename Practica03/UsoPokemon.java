import java.util.Random;

public class UsoPokemon{

	public static void main(String[] args){

		Random rand = new Random();

		int speed = rand.nextInt(100)+1;
		int speedTwo = rand.nextInt(100)+1;

		Pokemon pokemon1 = new Pokemon("Pikachu", "eléctrico", 100, false, speed);
		Pokemon pokemon2 = new Pokemon("Phanpy", "tierra", 90, false, speedTwo);

		//pokemon1.mochila.setElixir(false);

		System.out.println(pokemon1);
		System.out.println();
		System.out.println(pokemon2);

		System.out.println("\nEmpieza el de mayor velocidad");

		if(pokemon1.getVelocidad() > pokemon2.getVelocidad()){

			System.out.println(pokemon1.getNombre() + " ataca primero");

		} else {

			System.out.println(pokemon2.getNombre() + " ataca primero");

		}	

	}

}
