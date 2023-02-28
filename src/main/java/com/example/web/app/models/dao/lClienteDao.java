package com.example.web.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.web.app.models.entity.Cliente;


public interface lClienteDao extends CrudRepository<Cliente, Long>  {
	
	

}
