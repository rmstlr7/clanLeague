package com.posco.mes3.cart.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.posco.mes3.cart.domain.entity.Cart;
import com.posco.mes3.cart.domain.entity.Item;
import com.posco.mes3.cart.domain.lifecycle.ServiceLifecycle;
import com.posco.mes3.cart.domain.spec.CartService;

@RestController
public class CartResource {

	private final CartService cartService;
	
	public CartResource(ServiceLifecycle serviceLifecycle) {
		// 
		this.cartService = serviceLifecycle.requestCartService();
	}
	
	// POST http:/...../posco/item/P001
	@PostMapping(value = "/{userId}/item/")
	public void addItem(@PathVariable(value ="userId") String userId
						, @RequestBody Item item) {
		this.cartService.addItem(userId, item);
		
	}
	
	// DELETE http:/...../posco/item
	@DeleteMapping(value = "/{userId}/item/{productNo}")
	public void removeItem(@PathVariable(value ="userId") String userId
						 , @PathVariable(value ="productNo") String productNo  ) {
 
		this.cartService.removeItem(userId, productNo);

	}
	
	// PUT http:/...../posco/item/P001/3
	@PutMapping(value = "/{userId}/item/{productNo}/{quantity}")
	public void changeQuantity(@PathVariable(value ="userId") String userId
							,  @PathVariable(value ="productNo") String productNo
							,  @PathVariable(value ="quantity") int quantity) {

		this.cartService.changeQuantity(userId, productNo, quantity);
	}
	
// rmstlr7
	// PUT http:/...../posco/item/P001/3
//	@PutMapping(value = "/item/{productNo}")
//	public Cart findCart(@PathVariable(value ="productNo") String productNo) {
//		return this.cartService.findCart(productNo);
//	}
	
}
