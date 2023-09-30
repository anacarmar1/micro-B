package com.cuentasmdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cuentas")
public class Cuentas {
	
	@Id
	private int idcuenta;
	
	private int numerocuenta;
	
	private String banco;
	
	private int sucursal;
	
	private int cuentaclabe;
	
	private int idcliente;

	public int getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}

	public int getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getCuentaclabe() {
		return cuentaclabe;
	}

	public void setCuentaclabe(int cuentaclabe) {
		this.cuentaclabe = cuentaclabe;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
	

}
