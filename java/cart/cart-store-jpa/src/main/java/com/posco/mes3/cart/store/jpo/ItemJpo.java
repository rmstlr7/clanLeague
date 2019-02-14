package com.posco.mes3.cart.store.jpo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.posco.mes3.cart.domain.entity.Item;

public class ItemJpo {

	//
	@Id
	@GeneratedValue
	private int id;
	private String prodcutId;
	private String productName;
	private long price;
	private int quantity;
	
	
	public ItemJpo() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemJpo(Item item) {
		this();
		this.prodcutId = item.getProductNo();
		this.price = item.getPrice();
		this.quantity = item.getQuantity();
	}
	
	// rmstlr7
//	public toDomain() {
//		CartProduct cartProduct = new CartProduct(this.productid, this.price, this.quantity);
//		return new Item();	//변수삽입해야됨
//	}
}
