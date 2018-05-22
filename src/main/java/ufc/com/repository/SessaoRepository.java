package ufc.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.com.model.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Integer>{
	Optional<Sessao> findById(Integer id);
}
