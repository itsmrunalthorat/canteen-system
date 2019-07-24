package com.canteen.service;

import java.util.List;

import com.canteen.dto.*;

public interface ItemService {	
	public void createItem(Item item);
	public void removeItem(String itemId);
	public void modifyItem(Item item);
	public List<Item> selectAllItems();
	public List<Daily> retriveDate(Daily date);
	public boolean loginmethod(Login log);
	
	
}