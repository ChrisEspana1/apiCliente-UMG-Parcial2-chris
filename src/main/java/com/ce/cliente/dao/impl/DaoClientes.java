package com.ce.cliente.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ce.cliente.dao.IDaoClientes;
import com.ce.cliente.entity.Clientes;

import lombok.extern.slf4j.Slf4j;

@Repository
@Transactional
@Slf4j
public class DaoClientes implements IDaoClientes {
	@PersistenceContext
	private EntityManager manager;
	@Transactional (readOnly = true)
	@Override
	public List<Clientes> findAll() {
		try {
			@SuppressWarnings("unchecked")
			List<Clientes> listClientes = manager.createQuery("from Clientes").getResultList();
			return listClientes;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Clientes save(Clientes cliente) {
		try {
			manager.persist(cliente);
			return cliente;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Clientes update(Clientes cliente) {
		try {
			manager.merge(cliente);
			return cliente;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Clientes findById(int idcliente) {
		Clientes c = manager.find(Clientes.class, idcliente);
		if (c == null) {
            throw new EntityNotFoundException("No se encontró al cliente con el Id: "
                    + idcliente);
        }
		return c;
	}

	

}
