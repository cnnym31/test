package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport {

	private int id;

	public String execute() throws SQLException{
		UserDeleteCompleteDAO userDeleteCompleteDAO = new UserDeleteCompleteDAO();
		userDeleteCompleteDAO.userDelete(id);

		return SUCCESS;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

}
