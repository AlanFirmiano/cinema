package ufc.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufc.com.model.Cinema;
import ufc.com.repository.CinemaRepository;
import ufc.com.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{
	@Autowired
    CinemaRepository repository;

    public String save(Cinema cinema){
        repository.save(cinema);
        return "adicionado!";
    }

    public String delete(int id){
        repository.deleteById(id);
        return "removido";
    }

    public String update(Cinema cinema){
        repository.save(cinema);
        return "autualizado";
    }

    public Cinema get(int id){
        return this.repository.findById(id).get();
    }
    public List<Cinema> get(){
        return this.repository.findAll();
    }
}
