package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private UserListDAO userListDAO  = new UserListDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();


	public String execute() throws SQLException{
		userList = userListDAO.getUserList();
		return SUCCESS;

	}

	public ArrayList<UserListDTO> getUserList(){
		return userList;
	}

	public void setUserList(ArrayList<UserListDTO> userList){
		this.userList = userList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}