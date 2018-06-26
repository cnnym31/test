package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateCompleteAction extends ActionSupport implements SessionAware {
	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String, Object> session;

	public String execute() throws SQLException{
		ItemUpdateCompleteDAO itemUpdateCompleteDAO = new ItemUpdateCompleteDAO();
		itemUpdateCompleteDAO.itemUpdate(
				session.get("itemName").toString(),
				Integer.parseInt(session.get("itemPrice").toString()),
				Integer.parseInt(session.get("itemStock").toString()),
				Integer.parseInt(session.get("id").toString()));

		return SUCCESS;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int itemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int itemStock(){
		return itemStock;
	}

	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
