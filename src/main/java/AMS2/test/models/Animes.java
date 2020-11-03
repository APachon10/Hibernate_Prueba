package AMS2.test.models;

import javax.persistence.*;

@Entity
@Table(name="animes")
public class Animes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="anime_id")
	private long anime_id;
	@Column(name ="name")
	private String nombre;
	@Column(name ="num_Chapters")
	private int num_Capitulos;
	@ManyToMany
	@Column(name = "Genero")
	private String genero;
	
	// Contructores 
	public Animes() {
		super();
	}
	public Animes(String nombre, int num_Capitulos, String genero) {
		super();
		this.nombre = nombre;
		this.num_Capitulos = num_Capitulos;
		this.genero = genero;
	}

	// Getters
	public long getAnime_id() {
		return anime_id;
	}

	public String getNombre() {
		return nombre;
	}
	public int getNum_Capitulos() {
		return num_Capitulos;
	}
	public String getGenero() {
		return genero;
	}
	//Setters
	public void setAnime_id(long anime_id) {
		this.anime_id = anime_id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	public void setNum_Capitulos(int num_Capitulos) {
		this.num_Capitulos = num_Capitulos;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Animes [anime_id=" + anime_id + ", nombre=" + nombre + ", num_Capitulos=" + num_Capitulos + ", genero="
				+ genero + "]";
	}

	
}
