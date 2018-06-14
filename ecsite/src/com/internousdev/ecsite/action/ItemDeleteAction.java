package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	public String execute() throws SQLException{
		ItemDeleteDAO itemDeleteDAO = new ItemDeleteDAO();

		if(!session.containsKey("id")){
			return ERROR;
		} else {
			String id = session.get("id").toString();
			itemList = itemDeleteDAO.itemDelete(id);

		}

		return SUCCESS;

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

