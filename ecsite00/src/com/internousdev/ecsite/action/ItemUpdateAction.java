package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateAction extends ActionSupport implements SessionAware {
	private int id;
	public Map<String, Object> session;
	private List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	public String execute() throws SQLException{
		ItemListDAO itemListDAO = new ItemListDAO();
		ItemListDTO itemListDTO = new ItemListDTO();

		itemListDTO = itemListDAO.getItemInfo(id);

		session.put("id", itemListDTO.getId());
		session.put("itemName", itemListDTO.getItemName());
		session.put("itemPrice", itemListDTO.getItemPrice());
		session.put("itemStock", itemListDTO.getItemStock());

		return SUCCESS;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
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
