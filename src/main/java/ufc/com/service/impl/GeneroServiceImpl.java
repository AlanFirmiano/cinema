package ufc.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufc.com.model.Genero;
import ufc.com.repository.GeneroRepository;

@Service
public class GeneroServiceImpl {
	@Autowired
    GeneroRepository repository;

    public String save(Genero genero){
        repository.save(genero);
        return "adicionado!";
    }

    public String delete(int id){
        repository.deleteById(id);
        return "removido";
    }

    public String update(Genero genero){
        repository.save(genero);
        return "autualizado";
    }

    public Genero get(int id){
        return this.repository.findById(id).get();
    }
    public List<Genero> get(){
        return this.repository.findAll();
    }
}
