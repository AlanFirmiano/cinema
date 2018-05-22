package ufc.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.com.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer>{
	Optional<Filme> findById(Integer id);
}
