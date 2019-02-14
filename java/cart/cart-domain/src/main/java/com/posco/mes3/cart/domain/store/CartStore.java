package com.posco.mes3.cart.domain.store;

import com.posco.mes3.cart.domain.entity.Cart;

public interface CartStore {
	//
	public void create(String userId);
	public Cart retrieve(String userId);
	public void update(Cart cart);
	
	public boolean exists(String userId);
}
