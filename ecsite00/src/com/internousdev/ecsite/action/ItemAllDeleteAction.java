package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAllDeleteAction extends ActionSupport {
	public String execute() throws SQLException{
		ItemDeleteCompleteDAO itemDeleteCompleteDAO = new ItemDeleteCompleteDAO();
		itemDeleteCompleteDAO.itemAllDelete();

		return SUCCESS;
	}

}
