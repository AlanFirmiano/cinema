package ufc.com.service;

import java.util.List;

import ufc.com.model.Genero;

public interface GeneroService {

	public String save(Genero genero);
	
	public String update(Genero genero);
	
	public String delete(int id);
	
	public Genero get(int id);
	
	public List<Genero> get();
	
}
