package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class CartInfoDAO {
	public int addCart(String userId, int itemId, int itemCount, int itemPrice) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		int result = 0;

		String sql = "INSERT INTO cart_info(user_id, item_id, item_count, item_price, insert_date) VALUES(?, ?, ?, ?, ?)";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, itemId);
			preparedStatement.setInt(3, itemCount);
			preparedStatement.setInt(4, itemPrice);
			preparedStatement.setString(5, dateUtil.getDate());
			result = preparedStatement.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return result;
	}


}
