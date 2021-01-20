package co.hospital.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import co.hospital.exception.ExceptionBody;
import co.hospital.exception.HospitalException;

@ControllerAdvice
public class ExcepcionesHandler extends ResponseEntityExceptionHandler {
	
	private static String ERROR_INESPERADO = "A ocurrido un error inesperado, por favor contacte al administrador del sistema";
	
	@ExceptionHandler(value = {HospitalException.class})
	protected ResponseEntity<Object> manejarHospitalExcepcion(RuntimeException ex, WebRequest request) {
		ExceptionBody body = new ExceptionBody();
		body.setMensaje(ex.getMessage());
		body.setCodigo("600");
		return handleExceptionInternal(ex, body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
	
	@ExceptionHandler(value = {RuntimeException.class})
	protected ResponseEntity<Object> manejarExcepcion(RuntimeException ex, WebRequest request) {		
		ExceptionBody body = new ExceptionBody();
		body.setMensaje(ERROR_INESPERADO);
		body.setCodigo("500");
		return handleExceptionInternal(ex, body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}

}
