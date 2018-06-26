package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteAction extends ActionSupport implements SessionAware {

	private int id;
	public Map<String, Object> session;

	public String execute() throws SQLException{
		UserListDAO userListDAO = new UserListDAO();
		UserListDTO userListDTO = new UserListDTO();

		userListDTO = userListDAO.getUserInfo(id);

		session.put("id", userListDTO.getId());
		session.put("loginId", userListDTO.getLoginId());
		session.put("loginPassword", userListDTO.getLoginPassword());
		session.put("userName", userListDTO.getUserName());

		return SUCCESS;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
