package com.posco.mes3.cart.domain.logic;

import com.posco.mes3.cart.domain.entity.Cart;
import com.posco.mes3.cart.domain.entity.CartProduct;
import com.posco.mes3.cart.domain.entity.Item;
import com.posco.mes3.cart.domain.lifecycle.StoreLifecycle;
import com.posco.mes3.cart.domain.spec.CartService;
import com.posco.mes3.cart.domain.store.CartStore;

public interface ProductProxy {
	public CartProduct findProduct(String productNo);
	
	
}
