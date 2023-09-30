package com.cuentasmdb.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuentasmdb.entity.Clientes;
import com.cuentasmdb.entity.Cuentas;
import com.cuentasmdb.entity.Cuentasdetalle;
import com.cuentasmdb.entity.Operacion;
import com.cuentasmdb.service.OperacionService;

@RestController
@RequestMapping("/api/operacion")
public class OperacionController {
	
	@Autowired
	OperacionService operacionService;
	
	//Se manda llamar directamente
	@PostMapping("/crear")	
	public Operacion crearOperacion(@RequestBody Operacion operacion) {
		return operacionService.crearOperacion(operacion);
		
	}
	
	@GetMapping("/getCliente/{idcliente}")
	public ResponseEntity<Clientes> devuelveCliente(@PathVariable("idcliente") int idcliente){
		Clientes clienteres = operacionService.devuelveCliente(idcliente);
		insertaOperacion("Consulta cliente");
		return ResponseEntity.ok(clienteres);
	}
	
	@GetMapping("/getCuentaCliente/{idcliente}")
	public ResponseEntity<List<Cuentas>> devuelveCuentaCliente(@PathVariable("idcliente") int idcliente){
		List<Cuentas> cuentares = operacionService.devuelveCuentaCliente(idcliente);
		insertaOperacion("Consulta cuenta cliente");
		return ResponseEntity.ok(cuentares);
	}
	
	@GetMapping("/getDetalleCuenta/{idcuenta}")
	public ResponseEntity<List<Cuentasdetalle>> devuelveDetalleCuenta(@PathVariable("idcuenta") int idcuenta){
		List<Cuentasdetalle> cuentares = operacionService.devuelveDetalleCuenta(idcuenta);
		insertaOperacion("Consulta detalle cuenta cliente");
		return ResponseEntity.ok(cuentares);
	}
	
	
	//-------------------------------------------------------------------------------------------->
	
    public static java.sql.Timestamp getNow(){
        java.util.Calendar calendarHoy=Calendar.getInstance();
        java.util.Date hoy=calendarHoy.getTime();
        Timestamp hoySql=new Timestamp(hoy.getTime());
        return hoySql;
    }
    
    //Se manda llamar cuando hay una consulta en el cliente
    public Operacion insertaOperacion(String operacionString) {
    	Operacion operacionobj = new Operacion(); 
		Timestamp hoy=getNow();
		operacionobj.setNombreopprevia(operacionString);
		operacionobj.setTimestampopprevia(hoy);
		return operacionService.crearOperacion(operacionobj);
    }

}
