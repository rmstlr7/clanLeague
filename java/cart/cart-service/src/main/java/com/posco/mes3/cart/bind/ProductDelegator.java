package com.posco.mes3.cart.bind;

import org.springframework.stereotype.Component;

import com.posco.mes3.cart.domain.entity.CartProduct;
import com.posco.mes3.cart.domain.lifecycle.ServiceLifecycle;
import com.posco.mes3.cart.domain.proxy.ProductProxy;
import com.posco.mes3.cart.domain.spec.CartService;

@Component
public class ProductDelegator implements ProductProxy{
	

	@Override
	public CartProduct findProduct(String productNo) {
		return new CartProduct("1234", productNo, 0);
	}
	
}
