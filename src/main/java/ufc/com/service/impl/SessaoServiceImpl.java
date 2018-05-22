package ufc.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufc.com.model.Sessao;
import ufc.com.repository.SessaoRepository;

@Service
public class SessaoServiceImpl {
	@Autowired
	SessaoRepository repository;

    public String save(Sessao sessao){
        repository.save(sessao);
        return "adicionado!";
    }

    public String delete(int id){
        repository.deleteById(id);
        return "removido";
    }

    public String update(Sessao sessao){
        repository.save(sessao);
        return "autualizado";
    }

    public Sessao get(int id){
        return this.repository.findById(id).get();
    }
    public List<Sessao> get(){
        return this.repository.findAll();
    }
}
