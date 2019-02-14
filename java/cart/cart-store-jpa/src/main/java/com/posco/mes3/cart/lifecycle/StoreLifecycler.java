package com.posco.mes3.cart.lifecycle;

import org.springframework.stereotype.Component;

import com.posco.mes3.cart.domain.lifecycle.StoreLifecycle;
import com.posco.mes3.cart.domain.store.CartStore;

@Component
public class StoreLifecycler implements StoreLifecycle{
	//
	private final CartStore cartStore;
	
	public StoreLifecycler(CartStore cartStore) {
		//
		this.cartStore = cartStore;
	}

	@Override
	public CartStore requestCartStore() {
		// TODO Auto-generated method stub
		 return this.cartStore;
	}

}
