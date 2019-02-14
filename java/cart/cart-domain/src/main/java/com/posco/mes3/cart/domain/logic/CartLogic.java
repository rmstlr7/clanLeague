package com.posco.mes3.cart.domain.logic;

import com.posco.mes3.cart.domain.entity.Cart;
import com.posco.mes3.cart.domain.entity.CartProduct;
import com.posco.mes3.cart.domain.entity.Item;
import com.posco.mes3.cart.domain.lifecycle.StoreLifecycle;
import com.posco.mes3.cart.domain.spec.CartService;
import com.posco.mes3.cart.domain.store.CartStore;
import com.posco.mes3.cart.domain.proxy.ProductProxy;

public class CartLogic implements CartService{
	
	private ProductProxy productProxy;	//rmstlr7
	private CartStore cartStore;
	
	public CartLogic(StoreLifecycle storeLifecycle, ProductProxy productProxy) {	//rmstlr7
		//
		this.cartStore = storeLifecycle.requestCartStore();
		this.productProxy = storeLifecycle.requestProductProxy();	//rmstlr7
	}
	
// rmstlr7
//	public void registerItem(String userId, String productNo, int quantity) {
//		if(!cartStore.exists(userId)) {
//			cartStore.create(userId);
//		}
//		
//		Cart foundCart = cartStore.retrieve(userId);
//		CartProduct product = productProxy.findProduct(productNo);
//		
//		foundCart.addItem(new Item(productNo, price, quantity));
//		cartStore.update(foundCart);
//	}
	
// rmstlr7
//	public Cart findCart(String userId) {
//		return cartStore.retrieve(userId);
//	}
	
	@Override
	public void addItem(String userId, Item item) {

		// 1. cart가 있는지 호가인하고 없으면 생성
		if(!cartStore.exists(userId)) {
			cartStore.create(userId);
		}
		
		// 2. cart에 상품을 추가
		Cart cart = cartStore.retrieve(userId);
		cart.addItem(item);
		
		// 3. cart를 DB에 저장
		cartStore.update(cart);
	}

	@Override
	public void removeItem(String userId, String productNo) {
		//
		// 1. cart 찾는다.
		Cart cart = cartStore.retrieve(userId);
		
		// 2. cart에서 item을 삭제한다.
		Item item = cart.findItem(productNo);
		cart.removeItem(item);
		
		// 3. cart를 DB저장
		cartStore.update(cart);
	}

	@Override
	public void changeQuantity(String userId, String productNo, int quantity) {
		//
		// 1. cart 찾는다.
		Cart cart = cartStore.retrieve(userId);
		
		// 2. productNo에 해당하는 Item의 수량을 변경
		cart.changeQuantity(productNo, quantity);
		
		// 3. cart를 DB에 저장
		cartStore.update(cart);
	}
	
}
