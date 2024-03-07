package modelo.objetos;

public class Jugador {
	
	private String nombre;
	private String contraseña;
	private String color;
	private int numPartidas;
	private int numAsesino;
	private int numVictorias;
	
	//----------Constructor----------//
	public Jugador(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	//----------Constructor----------//

	
	//--------------SET--------------//
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNumPartidas(int numPartidas) {
		this.numPartidas = numPartidas;
	}
	
	public void setNumAsesino(int numAsesino) {
		this.numAsesino = numAsesino;
	}
	
	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}
	//--------------SET--------------//
	
	
	//--------------GET--------------//
	public String getNombre() {
		return nombre;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getNumPartidas() {
		return numPartidas;
	}
	
	public int getNumAsesino() {
		return numAsesino;
	}
	
	public int getNumVictorias() {
		return numVictorias;
	}
	//--------------GET--------------//
	
	
	//-----------toString------------//
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", contraseña=" + contraseña + ", color=" + color + ", numPartidas="
				+ numPartidas + ", numAsesino=" + numAsesino + ", numVictorias=" + numVictorias + "]";
	}
	//-----------toString------------//

}
