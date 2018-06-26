package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	public List<UserListDTO> getUserList() throws SQLException{
		List<UserListDTO> userList = new ArrayList<UserListDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM login_user_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				UserListDTO dto = new UserListDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setLoginId(resultSet.getString("login_id"));
				dto.setLoginPassword(resultSet.getString("login_pass"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				dto.setUpdate_date(resultSet.getString("update_date"));
				userList.add(dto);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return userList;
	}

	public UserListDTO getUserInfo(int id) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		UserListDTO userListDTO = new UserListDTO();

		String sql = "SELECT * FROM login_user_transaction WHERE id=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				userListDTO.setId(resultSet.getInt("id"));
				userListDTO.setLoginId(resultSet.getString("login_id"));
				userListDTO.setLoginPassword(resultSet.getString("login_pass"));
				userListDTO.setUserName(resultSet.getString("user_name"));
				userListDTO.setInsert_date(resultSet.getString("insert_date"));
				userListDTO.setUpdate_date(resultSet.getString("update_date"));
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return userListDTO;
	}

}
