package com.bio11.product.service;

import java.util.List;

import com.bio11.product.dto.BasketDTO;

public interface BasketService {
	public int addBasket(BasketDTO basket);
	public int deleteBasket(int cartId);
	public int modifyCount(BasketDTO basket);
	public List<BasketDTO> getBasketList(String userId);
	public BasketDTO checkBasket(BasketDTO basket);
}
