package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CartInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware {

	private int itemId;
	private String itemName;
	private String imageFilePath;
	private String imageFileName;
	private int itemPrice;
	private int itemCount;
	private String insert_date;
	private Map<String, Object> session;

	public String execute() throws SQLException{
		String result = ERROR;
		String userId = null;

		session.put("count", itemCount);
		if(session.containsKey("login_user_id")){
			userId = String.valueOf(session.get("login_user_id"));
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		int count = cartInfoDAO.addCart(userId,
				Integer.parseInt(session.get("id").toString()),
				Integer.parseInt(session.get("count").toString()),
				Integer.parseInt(session.get("itemPrice").toString()));

		System.out.println(userId);
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}

	public int getItemId(){
		return itemId;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getImageFilePath(){
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName(){
		return imageFileName;
	}

	public void setImageFileName(String imageFileName){
		this.imageFileName = imageFileName;
	}

	public int getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemCount(){
		return itemCount;
	}

	public void setItemCount(int itemCount){
		this.itemCount = itemCount;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
