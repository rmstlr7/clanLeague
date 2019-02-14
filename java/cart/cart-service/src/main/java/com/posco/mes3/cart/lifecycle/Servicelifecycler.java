package com.posco.mes3.cart.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.posco.mes3.cart.domain.lifecycle.ServiceLifecycle;
import com.posco.mes3.cart.domain.lifecycle.StoreLifecycle;
import com.posco.mes3.cart.domain.logic.CartLogic;
import com.posco.mes3.cart.domain.spec.CartService;

@Component
public class Servicelifecycler implements ServiceLifecycle{

// rmstlr7
//	@Autowired
//	StoreLifecycle storeLifeCycle;
//	
//	@Autowired
//	ProxyLifeCycle proxyLifeCycle;
	
	private final CartService cartService;
	
	
	
	public Servicelifecycler(CartService cartService) {
		this.cartService = cartService;
	}
	
	@Override
	public CartService requestCartService() {
		//return new CartLogic(storeLifecycle, productProxy);	// rmstlr7
		// 
		return this.cartService;
	}
	
}
