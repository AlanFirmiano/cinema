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

import ufc.com.model.Filme;
import ufc.com.service.FilmeService;

@RestController
@RequestMapping("/filme")
@CrossOrigin(origins = "*")
public class FilmeController {
	@Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Filme filme){
    	return ResponseEntity.ok(service.save(filme));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Filme filme){
        return ResponseEntity.ok(service.update(filme));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> get(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<List<Filme>> get(){
        return ResponseEntity.ok(service.get());
    }
}
