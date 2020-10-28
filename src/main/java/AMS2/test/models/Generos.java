package AMS2.test.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Generos {
	@Id
	@Column(name="id")
	private long id_genero;
	@ManyToOne
	@JoinColumn(name="anime_id")
	private String nombre_genero;
	
}
