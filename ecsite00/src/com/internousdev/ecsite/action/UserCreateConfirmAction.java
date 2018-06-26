package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(loginId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))){
			session.put("loginId", loginId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
		} else {
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}

		return result;
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

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
