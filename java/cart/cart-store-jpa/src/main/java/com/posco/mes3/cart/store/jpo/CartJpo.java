package com.posco.mes3.cart.store.jpo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.posco.mes3.cart.domain.entity.Cart;

@Entity
@Table(name = "TB_CART")
public class CartJpo {
	//
	@Id
	private String id;
	
	//rmstlr7
	@OneToMany(fetch=FetchType.EAGER, Cascade = CascadeType.ALL)
	@JoinColumn(name="cartId")
	private List<ItemJpo> itemJpos;
	
	public CartJpo() {
		this.itemJpos = new ArrayList<ItemJpo>();
	}
	
// rmstlr7
//	public CartJpo(Cart cart) {
//		this();
//		this.id = cart.getUserId();
//		for(CartItem cartItem : cart.getItems()) {
//			itemJpos.add(new ItemJpo(cartItem));
//		}
//	}

	
// rmstlr7
//		public toDomain() {
//			Cart cart = new Cart(this.id);
//			
//			for(ItemJpo itemJpo : itemJpo) {
//				cart.add(itemJpo.toDomain());
//			}
//		}
	
	public CartJpo(String id) {
		this.id = id;
	}
	
	public CartJpo(Cart cart) {
		this.id = cart.getUserId();
	}
	
	public Cart toDomain() {
		return new Cart(this.id);
	}
	
	
}
