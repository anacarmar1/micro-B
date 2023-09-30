package com.cuentasmdb.entity;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "operacion")
public class Operacion {
	
	@Id
	private String id;
	
	@Field(name = "nombreopprevia")
	private String nombreopPrevia;
	
	@Field(name = "timestampopprevia")
	private Timestamp timestampopprevia;
	
	
	/*public Operacion(String id, String nombreopPrevia, Long timestampopprevia) {
		super();
		this.id = id;
		this.nombreopPrevia = nombreopPrevia;
		this.timestampopprevia = timestampopprevia;
	}*/
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreopprevia() {
		return nombreopPrevia;
	}
	public void setNombreopprevia(String nombreopPrevia) {
		this.nombreopPrevia = nombreopPrevia;
	}
	public Timestamp getTimestampopprevia() {
		return timestampopprevia;
	}
	public void setTimestampopprevia(Timestamp timestampopprevia) {
		this.timestampopprevia = timestampopprevia;
	}
}
