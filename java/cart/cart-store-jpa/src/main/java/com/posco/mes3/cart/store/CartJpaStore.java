package com.posco.mes3.cart.store;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.posco.mes3.cart.domain.entity.Cart;
import com.posco.mes3.cart.domain.store.CartStore;
import com.posco.mes3.cart.store.jpo.CartJpo;
import com.posco.mes3.cart.store.repository.CartRepository;

@Repository
public class CartJpaStore implements CartStore {

	private CartRepository cartRepository;
	
	public CartJpaStore(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}
	
	@Override
	public void create(String userId) {
		// TODO Auto-generated method stub
		//Cart cart = new Cart(userId);
		this.cartRepository.save(new CartJpo(userId));

	}

	@Override
	public Cart retrieve(String userId) {
		
		Optional<CartJpo> cartJpo = this.cartRepository.findById(userId);
		if ( !cartJpo.isPresent() ) {
			throw new NoSuchElementException("");
			//throw new NoSuchElementException("produyct(%s) is not found ", id);
		}
		
		return cartJpo.get().toDomain();
	}

	@Override
	public void update(Cart cart) {
		this.cartRepository.save(new CartJpo(cart));

	}

	@Override
	public boolean exists(String userId) {
		return this.cartRepository.existsById(userId);
	}

}
