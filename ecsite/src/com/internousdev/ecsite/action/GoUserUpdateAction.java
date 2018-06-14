package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoUserUpdateAction extends ActionSupport {

	private List<UserListDTO> userList = new ArrayList<UserListDTO>();

	public String execute() throws SQLException{
		String ret = ERROR;
		UserListDAO userListDAO  = new UserListDAO();
		userList = userListDAO.getUserList();

		if(userList.size() > 0){
			ret = SUCCESS;
		} else {
			ret = ERROR;
		}
		return ret;

	}

	public List<UserListDTO> getUserList(){
		return userList;
	}

	public void setUserList(List<UserListDTO> userList){
		this.userList = userList;
	}
}