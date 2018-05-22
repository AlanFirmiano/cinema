package ufc.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cinema {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String cidade;
	//CINEMA POSSUI VARIAS SALAS
	public Cinema() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
