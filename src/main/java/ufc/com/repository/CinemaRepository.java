package ufc.com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.com.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer>{
	Optional<Cinema> findById(Integer id);
	
	List<Cinema> findAll();
}
