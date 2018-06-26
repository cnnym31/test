package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;

	public String execute(){
		session.put("loginId", loginId);
		session.put("loginPassword", loginPassword);
		session.put("userName", userName);

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
