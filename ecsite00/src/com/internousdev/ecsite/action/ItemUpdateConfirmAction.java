package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateConfirmAction extends ActionSupport implements SessionAware {

	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String, Object> session;

	public String execute(){
		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemStock", itemStock);

		return SUCCESS;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
