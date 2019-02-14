package com.posco.mes3.cart.domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.google.gson.reflect.TypeToken;

import lombok.Getter;

@Getter
public class Cart {
	
	private String userId;
	private long total;
	private List<Item> items;
	
	public Cart() {
		//
		this.total = 0L;
		this.items = new ArrayList<Item>();
	}
	
	public Cart(String userId) {
		//
		this();			// defualt 생성자 호출
		this.userId = userId;
	}
	
	public void addItem(Item item) {
		//
		if(!this.contains(item)) {
			this.items.add(item);
		}
		
		//rmstlr7
//		if(!this.existByProduct(item.getProductNo())) {
//			this.items.add(item);
//		}
	}
	
	// rmstlr7
//	public boolean existByProduct(String productNo) {
//		try {
//			Item cartItem = findItem(productNo);
//			return true;
//		}catch(NoSuchElementException e) {
//			return false;
//		}
//	}
	
	
//	rmstlr7
//	public Item findItem() {
//		for(Item item : this.items) {
//			if(item.getProduct().getId().equals(item.getProductNo())) {
//				return item;
//			}
//		}
//		throw new NoSuchElementException("");
//	}
	
	
	// rmstlr7	
//		public void removeItemByProduct(String productNo) {
//			
//			try {
//			Item foundItem = this.findItem(productNo);
//			this.items.remove(item);
//		}catch (NoSuchElementException e) {
//			//
//		}
//			this.items.remove(foundItem);
//		}
		
// rmstlr7
//public String itemsJson() {
//	return (new Gson()).toJson(items);
//}
	
//  rmstlr7
//	public void rebuildItems(String itemsJson) {
//		Type listType = new TypeToken<List<Item>>(){}.getType();
//		
//	}	
//  rmstlr7	
//	public static Cart sample() {
//		Cart cart = new Cart("posco");
//		return cart;
//	}
//  rmstlr7
//	public static void main(String[] args) {
//		System.out.println((new Gson()).toJson(Cart.sample()));
//	}
	
	private boolean contains(Item item) {		// private boolean isExistsItem(Item item) 
		//
		return this.items.contains(item);
	}
	
	public void removeItem(Item item) {
		
//		try {
//		Item foundItem = this.findItem(item);
//		this.items.remove(item);
//	}catch (NoSuchElementException e) {
//		//
//	}
		this.items.remove(item);
	}
	

	// 수량변경
	public void changeQuantity(String productNo, int quantity) {
		//
		
//		try {
//			Item foundItem = this.findItem(productNo);
//			foundItem.setQuantity(quantity);
//		}catch (NoSuchElementException e) {
//			//
//		}
		
		// 1.상품번호 검색
		Item foundItem = this.findItem(productNo);
		foundItem.setQuantity(quantity);
	}
	
	
	public Item findItem(String productNo) {
		for(Item item : this.items) {
			if(productNo.equals(item.getProductNo())) {
				return item;
			}
		}
		throw new NoSuchElementException("");
	}

	
	
	public static Cart sample() {
		Cart cart = new Cart("posco");
		Item item1 = new Item("P001",30000,1);
		cart.addItem(item1);
		
		return cart;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
