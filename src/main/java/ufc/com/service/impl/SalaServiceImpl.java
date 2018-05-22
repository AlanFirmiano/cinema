package ufc.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufc.com.model.Sala;
import ufc.com.repository.SalaRepository;

@Service
public class SalaServiceImpl {
	@Autowired
	SalaRepository repository;

    public String save(Sala sala){
        repository.save(sala);
        return "adicionado!";
    }

    public String delete(int id){
        repository.deleteById(id);
        return "removido";
    }

    public String update(Sala sala){
        repository.save(sala);
        return "autualizado";
    }

    public Sala get(int id){
        return this.repository.findById(id).get();
    }
    public List<Sala> get(){
        return this.repository.findAll();
    }
}
