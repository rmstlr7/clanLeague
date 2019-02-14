package com.posco.mes3.cart.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.posco.mes3.cart.domain.lifecycle.ProxyLifecycle;
import com.posco.mes3.cart.domain.lifecycle.ServiceLifecycle;
import com.posco.mes3.cart.domain.proxy.ProductProxy;
import com.posco.mes3.cart.domain.spec.CartService;

@Component
public class ProxyLifecycler implements ProxyLifecycle{
	@Autowired
	ProductProxy productProxy;
	
	@Override
	public ProductProxy requestProductProxy() {
		// TODO Auto-generated method stub
		return productProxy;
	}
	

}
