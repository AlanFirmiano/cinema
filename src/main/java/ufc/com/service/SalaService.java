package ufc.com.service;

import java.util.List;

import ufc.com.model.Sala;

public interface SalaService {

	public String save(Sala sala);
	
	public String update(Sala sala);
	
	public String delete(int id);
	
	public Sala get(int id);
	
	public List<Sala> get();
	
}
