package ufc.com.model;

import java.time.LocalTime;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Sessao{

	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	@OneToOne
	private Filme filme;
	@NotNull
	@OneToOne
	private Sala sala;
	
	@NotNull
	private LocalTime horario;
	
	@NotNull
	private Period periodo;
	
	public Sessao() {
		
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public LocalTime getHorario() {
		return horario;
	}
	
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	
	public Period getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(Period periodo) {
		this.periodo = periodo;
	}
		
}
