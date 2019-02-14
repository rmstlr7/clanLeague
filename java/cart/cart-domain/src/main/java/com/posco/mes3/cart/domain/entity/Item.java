package com.posco.mes3.cart.domain.entity;

public class Item {
	// 상품번호,가격,수량
	private String productNo;
	private long price;
	private int quantity;
	
	public Item() {
		
	}
	
	public Item(String productNo, long price, int quantity) {
		//
		this();
		this.productNo = productNo;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
