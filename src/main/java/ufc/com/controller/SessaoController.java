package ufc.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufc.com.model.Sessao;
import ufc.com.service.SessaoService;

@RestController
@RequestMapping("/sessao")
@CrossOrigin(origins = "*")
public class SessaoController {
	@Autowired
    private SessaoService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Sessao sessao){
    	return ResponseEntity.ok(service.save(sessao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Sessao sessao){
        return ResponseEntity.ok(service.update(sessao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sessao> get(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<List<Sessao>> get(){
        return ResponseEntity.ok(service.get());
    }
}
