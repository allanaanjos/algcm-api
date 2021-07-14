package com.allananjos.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allananjos.crm.model.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {
 
	
}
