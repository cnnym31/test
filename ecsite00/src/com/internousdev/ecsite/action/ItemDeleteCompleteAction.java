package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport {

	private int id;

	public String execute() throws SQLException{

		ItemDeleteCompleteDAO itemDeleteCompleteDAO = new ItemDeleteCompleteDAO();
		itemDeleteCompleteDAO.itemDelete(id);

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
