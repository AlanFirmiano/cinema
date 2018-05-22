package ufc.com.service;

import java.util.List;

import ufc.com.model.Cinema;

public interface CinemaService {
	
	public String save(Cinema cinema);
	
	public String update(Cinema cinema);
	
	public String delete(int id);
	
	public Cinema get(int id);
	
	public List<Cinema> get();
	
}
