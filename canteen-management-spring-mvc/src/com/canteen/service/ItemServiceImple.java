package com.canteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canteen.dao.*;
import com.canteen.dto.*;


@Service
public class ItemServiceImple implements ItemService {
	@Autowired
	private ItemDao itemDao;
	
	
	public void createItem(Item item) {
		itemDao.save(item);
	}
	
	public void removeItem(String itemId) {
		itemDao.deleteById(itemId);
	}
	
	public void modifyItem(Item item) {
		itemDao.update(item);
	}
	
	public List<Item> selectAllItems() {
		return itemDao.getAll();
	}

	@Override
	public List<Daily> retriveDate(Daily date) {
		// TODO Auto-generated method stub
		
		return itemDao.getDate(date);
	}

	@Override
	public boolean loginmethod(Login log) {
		// TODO Auto-generated method stub
		return itemDao.loginMethod(log);
	}


	
	
}