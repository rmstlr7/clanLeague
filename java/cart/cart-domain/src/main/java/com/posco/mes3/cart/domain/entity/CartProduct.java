package com.posco.mes3.cart.domain.entity;

//rmstlr7
public class CartProduct {
	// 상품번호,가격,수량
	private String id;
	private String name;
	private int price;
	
	public CartProduct(String id, String name, int price) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof CartProduct)){
			return false;
		}
		
		CartProduct target = (CartProduct)object;
		return this.id.equals(target.getId());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static CartProduct sample() {
		return new CartProduct("012345","laptop",87);
	}
}
