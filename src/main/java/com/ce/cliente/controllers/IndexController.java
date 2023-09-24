package com.ce.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ce.cliente.dao.IDaoClientes;
import com.ce.cliente.entity.Clientes;


@RestController
@RequestMapping(value ="/api")
public class IndexController {
	@Autowired
	private IDaoClientes daoClientes;

	@GetMapping(value = "/getcliente", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Clientes> getClientes() {
		return daoClientes.findAll();
	}
	
	@GetMapping(value = "/cliente/{idcliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Clientes getClientes(@PathVariable int idcliente) {
		return daoClientes.findById(idcliente);
	}
	
	@PostMapping(value = "/setcliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Clientes saveAlumno(@RequestBody Clientes cliente) {
		return daoClientes.save(cliente);
	}
	
	@PutMapping(value = "/upcliente/{idcliente}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Clientes updateAlumno(@PathVariable int idcliente, @RequestBody Clientes cliente) {
	    Clientes clienteToUpdate = daoClientes.findById(idcliente);
	    if (clienteToUpdate != null) {
	    	clienteToUpdate.setPrimernombre(cliente.getPrimernombre());
	    	clienteToUpdate.setSegundonombre(cliente.getSegundonombre());
	    	clienteToUpdate.setOtronombre(cliente.getOtronombre());
	    	clienteToUpdate.setPrimerapellido(cliente.getPrimerapellido());
	    	clienteToUpdate.setSegundoapellido(cliente.getSegundoapellido());
	    	clienteToUpdate.setOtroapellido(cliente.getOtroapellido());
	    	clienteToUpdate.setGenero(cliente.getGenero());
	    	clienteToUpdate.setFechanacimiento(cliente.getFechanacimiento());
	        clienteToUpdate.setSegmento(cliente.getSegmento());
	        clienteToUpdate.setSueldo(cliente.getSueldo());
	        clienteToUpdate.setDpi(cliente.getDpi());
	        clienteToUpdate.setCorreo(cliente.getCorreo());
	        clienteToUpdate.setTelefono(cliente.getTelefono());
	        clienteToUpdate.setDireccion(cliente.getDireccion());
	    	return daoClientes.update(clienteToUpdate);
	    } else {
	        return null;
	    }
	}

}
