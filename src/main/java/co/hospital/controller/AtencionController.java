package co.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.hospital.model.Atencion;
import co.hospital.services.AtencionService;

@RestController(value = "/atencion")
public class AtencionController {

	@Autowired
	private AtencionService atencionService;

	@GetMapping(value = "/listarAtenciones", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Atencion> buscarAtenciones() {
		return atencionService.buscarAtenciones();
	}

	@PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Atencion crearAtencion(@RequestBody Atencion atencion) {
		return atencionService.crearAtencion(atencion);
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Atencion buscarPorId(@Param("id") Long idAtencion) {
		return atencionService.buscarPorId(idAtencion);
	}
	
	@PostMapping(value = "/nueva", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarAtencion(@RequestBody Atencion atencion) {
		atencionService.eliminarAtencion(atencion);
	}

}
