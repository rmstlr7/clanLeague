package com.posco.mes3.cart.logic;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.posco.mes3.cart.domain.lifecycle.StoreLifecycle;
import com.posco.mes3.cart.domain.logic.CartLogic;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CartSpringLogic extends CartLogic{
	
	public CartSpringLogic(StoreLifecycle storeLifecycle) {
		super(storeLifecycle);
	}
	
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	public void addItem(String userId, Item item) {
//		super.addItem(userId, item);
//	}
}

