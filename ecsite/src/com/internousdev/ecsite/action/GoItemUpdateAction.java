package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemUpdateAction extends ActionSupport {

	private List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	public String execute() throws SQLException{
		ItemListDAO itemListDAO = new ItemListDAO();
		itemList = itemListDAO.getItemList();

		return SUCCESS;

	}

	public List<ItemListDTO> getItemList(){
		return itemList;
	}

	public void setItemList(List<ItemListDTO> itemList){
		this.itemList = itemList;
	}


}
