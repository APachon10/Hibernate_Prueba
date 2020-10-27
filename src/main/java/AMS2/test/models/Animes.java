package AMS2.test.models;

public class Animes {
	private Long anime_id;
	private String nombre;
	private int num_Capitulos;
	
	// Contructores 
	public Animes() {
		super();
	}
	public Animes(Long anime_id, String nombre, int num_Capitulos) {
		super();
		this.anime_id = anime_id;
		this.nombre = nombre;
		this.num_Capitulos = num_Capitulos;
	}
	
	// Getters
	public Long getAnime_id() {
		return anime_id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNum_Capitulos() {
		return num_Capitulos;
	}
	
	//Setters
	public void setAnime_id(Long anime_id) {
		this.anime_id = anime_id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	public void setNum_Capitulos(int num_Capitulos) {
		this.num_Capitulos = num_Capitulos;
	}
	
	// ToString
	@Override
	public String toString() {
		return "ID: " + anime_id + ", Name: " + nombre + ", num_Capitulos:" + num_Capitulos;
	}
	
}
