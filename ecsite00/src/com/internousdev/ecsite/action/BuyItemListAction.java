package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemListAction extends ActionSupport implements SessionAware {
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String imageFilePath;
	private String imageFileName;
	private List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	public Map<String, Object> session;

	public String execute() throws SQLException{

		ItemListDAO itemListDAO = new ItemListDAO();
		itemList = itemListDAO.getItemList();

		return SUCCESS;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemStock(){
		return itemStock;
	}

	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
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
		this.imageFileName= imageFileName;
	}

	public List<ItemListDTO> getItemList(){
		return itemList;
	}

	public void setItemList(List<ItemListDTO> itemList){
		this.itemList = itemList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
