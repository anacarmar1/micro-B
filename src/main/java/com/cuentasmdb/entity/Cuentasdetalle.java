package com.cuentasmdb.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cuentasdetalle")
public class Cuentasdetalle {
	@Id
	private int idcuentadetalle;
	
	private Date fecha;
	
	private int categoria;
	
	private String descripcion;
	
	private int importe;
	
	private int saldo;
	
	private int idcuenta;

	public int getIdcuentadetalle() {
		return idcuentadetalle;
	}

	public void setIdcuentadetalle(int idcuentadetalle) {
		this.idcuentadetalle = idcuentadetalle;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}
	
	

}
