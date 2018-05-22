package ufc.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufc.com.model.Filme;
import ufc.com.repository.FilmeRepository;

@Service
public class FilmeServiceImpl {
	@Autowired
	FilmeRepository repository;

    public String save(Filme filme){
        repository.save(filme);
        return "adicionado!";
    }

    public String delete(int id){
        repository.deleteById(id);
        return "removido";
    }

    public String update(Filme filme){
        repository.save(filme);
        return "autualizado";
    }

    public Filme get(int id){
        return this.repository.findById(id).get();
    }
    public List<Filme> get(){
        return this.repository.findAll();
    }
}
