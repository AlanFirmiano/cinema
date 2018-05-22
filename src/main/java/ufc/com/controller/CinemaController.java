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

import ufc.com.model.Cinema;
import ufc.com.service.CinemaService;

@RestController
@RequestMapping("/cinema")
@CrossOrigin(origins = "*")
public class CinemaController {
	@Autowired
    private CinemaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Cinema cinema){
    	return ResponseEntity.ok(service.save(cinema));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Cinema cinema){
        return ResponseEntity.ok(service.update(cinema));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cinema> get(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<List<Cinema>> get(){
        return ResponseEntity.ok(service.get());
    }
}
