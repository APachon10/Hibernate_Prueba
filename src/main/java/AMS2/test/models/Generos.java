package AMS2.test.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Generos {
	@Id
	@Column(name="id")
	private long id_genero;
	@Column(name = "nombre_genero")
	private String nombre_genero;
	@ManyToMany
	@JoinColumn(name="")
	private String num_animes;
	
}
