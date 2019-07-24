package com.canteen.controller;

import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.canteen.dto.*;
import com.canteen.service.*;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	/*
	 * @RequestMapping(value = "/prep_login_form.htm") public String
	 * prepLoginForm(ModelMap model) { model.put("user", new User()); return
	 * "index"; }
	 */
	
	/*@RequestMapping(value = "/retrievedata.htm")
	public String itemRegForm() {
		System.out.println("hiyooo");
		//model.put("item", new Item());
		return "add_item";
	}*/
	
/*	@RequestMapping(value = "/add_item.htm")
	public String addItem(Item item,ModelMap model) {
		itemService.createItem(item);
		model.put("item", new Item());
		//List<Item> ulist = itemService.selectAllItems();
		//model.put("ul", ulist);
		return "item";
	}
	*/
	
	
	@RequestMapping(value = "/dailyMenu.htm")
	public String itemList(ModelMap model) {
		List<Item> ulist = itemService.selectAllItems();
		model.put("ul", ulist);
		
		return "dailyMenu";
	}
	
	
	@RequestMapping(value = "/dateretrieve.htm")
	public String dateRetrive(@RequestParam("month") int month,@RequestParam("year") int year,ModelMap model) {
		System.out.println(month);
		Daily date=new Daily(month,year);
		List<Daily>uList=itemService.retriveDate(date);
	    model.put("ul",uList);
		return "monthlyItemReport";
	}
	
	

	@RequestMapping(value = "/login.htm")
	public String dateRetrive(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap model) {
	//System.out.println(month);
	Login log=new Login(username,password);
	boolean bool=itemService.loginmethod(log);
	  // model.put("ul",uList);
	if(bool)
	return "Link";
	else
	return "Login";
	}

	@RequestMapping("/submitForm.htm")  
	public String submitForm(@RequestParam("service") String service,ModelMap model)  
	{  
	    return "dailyMenu";  
	}  
	
	
/*	@RequestMapping(value = "/delete_item.htm")
	public String deleteItem(@RequestParam String itemId,ModelMap model) {
		itemService.removeItem(itemId);
	//	List<Item> ulist = itemService.selectAllItems();
		//model.put("ul", ulist);
		return "item";
	}
	*/
}