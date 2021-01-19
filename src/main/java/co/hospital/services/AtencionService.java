package co.hospital.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.hospital.exception.HospitalException;
import co.hospital.model.Atencion;
import co.hospital.repository.AtencionRepository;

@Service
public class AtencionService {
	
	@Autowired
	private AtencionRepository atencionRepository;
	
	public Iterable<Atencion> buscarAtenciones() {
		return atencionRepository.findAll();
	}
	
	public Atencion buscarPorId(Long id) {
		Optional<Atencion> encontrada = atencionRepository.findById(id);
		if (!encontrada.isPresent()) {
			throw new HospitalException("Atencion no encontrada");
		}
		return encontrada.get();
	}
	
	public Atencion crearAtencion(Atencion atencion) {
		return atencionRepository.save(atencion);
	}
	
	public void eliminarAtencion(Atencion atencion) {
		atencionRepository.delete(atencion);
	}

}
