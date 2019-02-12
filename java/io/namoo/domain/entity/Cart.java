package io.namoo.domain.entity;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cart {
	private String id;
	private List<CartItem> items;
	
	public Cart() {
		items = new ArrayList<CartItem>();
	}
	
	public Cart(String id) {
		this();
		this.id = id;
	}

	public void addItem(CartItem cartItem) {
		
	}
	
	
}
