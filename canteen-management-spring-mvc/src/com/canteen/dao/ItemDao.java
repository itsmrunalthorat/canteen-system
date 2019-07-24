package com.canteen.dao;
import com.canteen.dto.*;
import java.util.List;

public interface ItemDao {	
	public void save(Item item);	
	public void deleteById(String itemId);	
	public void update(Item item) ;
	public List<Item> getAll() ;
	public List<Daily> getDate(Daily date);
	public boolean loginMethod(Login log);
	
}