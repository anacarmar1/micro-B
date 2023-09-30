package com.cuentasmdb.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuentasmdb.entity.Clientes;
import com.cuentasmdb.entity.Cuentas;
import com.cuentasmdb.entity.Cuentasdetalle;


@FeignClient(name = "cuenta-service",url = "http://localhost:8002")
//@RequestMapping("/cuenta")
public interface CuentaFeignClient {
	
	@GetMapping(value="/cuenta/cliente/{idcliente}")
    Clientes devuelveCliente(@PathVariable("idcliente") int idcliente);
	
	@GetMapping(value="/cuenta/cuentacliente/{idcliente}")
	List<Cuentas> devuelveCuentaCliente(@PathVariable("idcliente") int idcliente);
	
	@GetMapping(value="/cuenta/cuentadetalle/{idcuenta}")
	List<Cuentasdetalle> devuelveDetalleCuenta(@PathVariable("idcuenta") int idcuenta);

}
