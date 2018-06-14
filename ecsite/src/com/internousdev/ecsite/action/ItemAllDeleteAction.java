package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemAllDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAllDeleteAction extends ActionSupport{
	public String execute() throws SQLException{
		ItemAllDeleteDAO itemAllDeleteDAO = new ItemAllDeleteDAO();
		itemAllDeleteDAO.itemAllDelete();

		return SUCCESS;
	}

}
