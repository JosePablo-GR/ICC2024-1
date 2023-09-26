import java.util.Random;

public class Pokemon{

	String nombre;
	String tipo;
	int energiaVital;
	boolean confundido;
	Mochila mochila;
	int velocidad; //1-100

	public Pokemon(String nombre, String tipo, int energiaVital, boolean confundido, int velocidad){

		this.nombre = nombre;
		this.tipo = tipo;
		this.energiaVital = 500;
		this.confundido = confundido;
		this.velocidad = velocidad;
		this.mochila = new Mochila(true,true,0);

	}

	public void setNombre(String nombre){

		this.nombre = nombre;

	}

	public void setTipo(String tipo){

		this.tipo = tipo;

	}

	public void setEnergiaVital(int energiaVital){

		this.energiaVital = energiaVital;

	}

	public void setConfundido(boolean confundido){

		this.confundido = confundido;

	}

	public void setVelocidad(int velocidad){

		this.velocidad = velocidad;

	}

	public String getNombre(){

		return nombre;

	}

	public String getTipo(){

		return tipo;

	}

	public int getEnergiaVital(){

		return energiaVital;

	}

	public boolean getConfundido(){

		return confundido;

	}

	public int getVelocidad(){

		return velocidad;

	}

	public String toString(){

		return nombre + " es de tipo " + tipo + " con " + energiaVital + " de energía vital y velocidad " + velocidad + "\n" + mochila;

	}

}
