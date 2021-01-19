package co.hospital.model;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Atencion")
public class Atencion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -781846590301399231L;
	private Long id;
	private Date fechaAtencion;
	private String identificacion;
	private String nombreEps;
	private Double valor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombreEps() {
		return nombreEps;
	}

	public void setNombreEps(String nombreEps) {
		this.nombreEps = nombreEps;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
