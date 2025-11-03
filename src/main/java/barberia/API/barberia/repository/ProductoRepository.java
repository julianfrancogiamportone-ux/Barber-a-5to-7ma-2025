package barberia.API.barberia.repository;

import barberia.API.barberia.model.maquinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<maquinas, Long> {
}
