package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware {
	private String loginId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;

	public String execute() throws SQLException{
		UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();
		userUpdateCompleteDAO.userUpdate(
				session.get("loginId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				Integer.parseInt(session.get("id").toString()));

		return SUCCESS;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
