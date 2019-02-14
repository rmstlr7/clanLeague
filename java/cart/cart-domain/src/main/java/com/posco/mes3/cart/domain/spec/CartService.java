package com.posco.mes3.cart.domain.spec;

import com.posco.mes3.cart.domain.entity.Cart;
import com.posco.mes3.cart.domain.entity.Item;

public interface CartService {
	//
	public void addItem(String userId, Item item);
	public void removeItem(String userId, String productNo);
	public void changeQuantity(String userId, String productNo, int quantity);
	public Cart findCart(String userId);
	
}
