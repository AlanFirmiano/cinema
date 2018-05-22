package ufc.com.service;

import java.util.List;

import ufc.com.model.Sessao;

public interface SessaoService {

	public String save(Sessao sessao);
	
	public String update(Sessao sessao);
	
	public String delete(int id);
	
	public Sessao get(int id);
	
	public List<Sessao> get();
	
}
