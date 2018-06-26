package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPassword;
	public Map<String, Object> session;

	public String execute(){
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		BuyItemDAO buyItemDAO = new BuyItemDAO();

		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginId, loginPassword);
		session.put("loginUser", loginDTO);

		if(loginId.equals("admin") && loginPassword.equals("admin")){
			result = "admin";
		} else if (((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("login_user_id", loginDTO.getLoginId());
			session.put("itemId", buyItemDTO.getItemId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			return result;
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

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
