package com.ce.cliente.dao;

import java.util.List;

import com.ce.cliente.entity.*;

public interface IDaoClientes {
	public List<Clientes> findAll();
	public Clientes save(Clientes cliente);
	public Clientes update (Clientes cliente);
	public Clientes findById(int idcliente);
}
