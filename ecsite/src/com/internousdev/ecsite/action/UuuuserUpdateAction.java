package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UuuuserUpdateAction extends ActionSupport implements SessionAware {
	private String oldLoginUserId;
	private String oldLoginPassword;
	private String oldUserName;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	public String execute(){
		String result = SUCCESS;
		loginDTO = loginDAO.getLoginUserInfo(oldLoginUserId, oldLoginPassword, oldUserName);

		session.put("old_login_user_id", loginDTO.getLoginId());
		session.put("old_login_password", loginDTO.getLoginPassword());
		session.put("old_user_name", loginDTO.getUserName());

		return result;

	}

	public String getOldLoginUserId(){
		return oldLoginUserId;
	}

	public void setLodLoginUserId(String oldLoginUserId){
		this.oldLoginUserId = oldLoginUserId;
	}

	public String getOldLoginPassword(){
		return oldLoginPassword;
	}

	public void setOldLoginPassword(String oldLoginPassword){
		this.oldLoginPassword = oldLoginPassword;
	}

	public String getOldUserName(){
		return oldUserName;
	}

	public void setOldUserName(String oldUserName){
		this.oldUserName = oldUserName;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
