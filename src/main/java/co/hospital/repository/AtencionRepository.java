package co.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.hospital.model.Atencion;

@Repository
public interface AtencionRepository extends CrudRepository<Atencion, Long> {

}
