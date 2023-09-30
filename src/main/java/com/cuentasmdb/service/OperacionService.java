package com.cuentasmdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuentasmdb.entity.Clientes;
import com.cuentasmdb.entity.Cuentas;
import com.cuentasmdb.entity.Cuentasdetalle;
import com.cuentasmdb.entity.Operacion;
import com.cuentasmdb.feignclients.CuentaFeignClient;
import com.cuentasmdb.repository.OperacionRepository;

@Service
public class OperacionService {
	
	@Autowired
	OperacionRepository operacionRepository;
	
	@Autowired
	CuentaFeignClient cuentaFeignClient;
	
	public Operacion crearOperacion(Operacion operacion) {
		return operacionRepository.save(operacion);
	}
	
	public Clientes devuelveCliente(int idcliente) {
		return cuentaFeignClient.devuelveCliente(idcliente);
	}
	
	public List<Cuentas> devuelveCuentaCliente(int idcliente) {
		return cuentaFeignClient.devuelveCuentaCliente(idcliente);
	}
	
	public List<Cuentasdetalle> devuelveDetalleCuenta(int idcuenta) {
		return cuentaFeignClient.devuelveDetalleCuenta(idcuenta);
	}
	
	

}
		