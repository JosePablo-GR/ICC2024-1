import java.util.Random;

public class Mochila{

	boolean oranberry;
	boolean elixir;
	int monedas;

	public Mochila(){}

	public Mochila(boolean oranberry, boolean elixir, int monedas){

		Random rd = new Random();

		this.oranberry = oranberry;
		this.elixir = elixir;
		this.monedas = rd.nextInt(400)+1;

	}

	public void setOranberry(boolean oranberry){

		this.oranberry = oranberry;

	}

	public void setElixir(boolean elixir){

		this.elixir = elixir;

	}

	public void setMonedas(int monedas){

		this.monedas = monedas;

	}

	public boolean getOranberry(){

		return oranberry;

	}

	public boolean getElixir(){

		return elixir;

	}

	public int getMonedas(){

		return monedas;

	}

	public String toString(){

		return "Mochila contiene: \noranberry - " + oranberry + "\nelixir - " + elixir + "\n" + monedas + " monedas";

	}

}
