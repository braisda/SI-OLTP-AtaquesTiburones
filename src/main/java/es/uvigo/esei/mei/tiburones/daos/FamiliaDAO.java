package es.uvigo.esei.mei.tiburones.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uvigo.esei.mei.tiburones.entidades.Familia;

@Repository
public interface FamiliaDAO extends JpaRepository<Familia, Long>{
	List<Familia> findByDescripcionContaining(String patron);
}
