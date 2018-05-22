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

import ufc.com.model.Sala;
import ufc.com.service.SalaService;

@RestController
@RequestMapping("/sala")
@CrossOrigin(origins = "*")
public class SalaController {
	@Autowired
    private SalaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Sala sala){
    	return ResponseEntity.ok(service.save(sala));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Sala sala){
        return ResponseEntity.ok(service.update(sala));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sala> get(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<List<Sala>> get(){
        return ResponseEntity.ok(service.get());
    }
}
