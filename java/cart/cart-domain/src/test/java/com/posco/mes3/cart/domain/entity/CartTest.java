package com.posco.mes3.cart.domain.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartTest {
	//
	private Cart cart;
	private Item item1;
	
	@Before					//생성자와 같이 함수테스트 이전에 실행, @After는 반대
	public void before() {
		
		cart = new Cart("posco");
		item1 = new Item("P001",30000,1);
		cart.addItem(item1);
	}
	
	@Test
	public void testAddItem() {
		
		//
// 		@Before before 메소드로 대체가능		
//		Cart cart = new Cart("posco");
//		Item item1 = new Item("P001",30000,1);
//		cart.addItem(item1);

//		Cart cart = Cart.sample();		//Cart Class에서 샘플데이터 코드작성
		Assert.assertTrue(cart.getItems().size() == 1);
	}
	
	
	//
	@Test
	public void testRemoveItem() {
		//
		
// 		@Before before 메소드로 대체가능			
//		Cart cart = new Cart("posco");
//		Item item1 = new Item("P001",30000,1);
//		cart.addItem(item1);

		cart.removeItem(item1);
		Assert.assertTrue(cart.getItems().size() == 0);
	}
	
	@Test
	public void testChangeQuantity() {

// 		@Before before 메소드로 대체가능	
//		Cart cart = new Cart("posco");
//		Item item1 = new Item("P001",30000,1);
//		cart.addItem(item1);
		
		cart.changeQuantity("P001",5);
		
		int actualQuantity = cart.getItems().get(0).getQuantity();
		Assert.assertEquals(5, actualQuantity);
	}
}
