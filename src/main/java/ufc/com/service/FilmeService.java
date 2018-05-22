package ufc.com.service;

import java.util.List;

import ufc.com.model.Filme;

public interface FilmeService {

	public String save(Filme filme);
	
	public String update(Filme filme);
	
	public String delete(int id);
	
	public Filme get(int id);
	
	public List<Filme> get();
	
}
