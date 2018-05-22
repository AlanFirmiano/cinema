package ufc.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.com.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{

}
