package ufc.com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.com.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer>{
	Optional<Sala> findById(Integer id);
	
	List<Sala> findAll();
}
