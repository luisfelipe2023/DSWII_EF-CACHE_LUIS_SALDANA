package tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.model.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
