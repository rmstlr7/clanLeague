package com.posco.mes3.cart.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posco.mes3.cart.store.jpo.CartJpo;

public interface CartRepository extends JpaRepository<CartJpo, String>{
	
}
