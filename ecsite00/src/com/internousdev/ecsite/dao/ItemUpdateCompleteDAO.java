package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemUpdateCompleteDAO {

	public int itemUpdate(String itemName, int itemPrice, int itemStock, int id) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "UPDATE item_info_transaction SET item_name=?, item_price=?, item_stock=?, update_date=? WHERE id=?";

		int result = 0;

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setInt(2, itemPrice);
			preparedStatement.setInt(3, itemStock);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.setInt(5, id);
			result = preparedStatement.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			connection.close();
		}

		return result;
	}

}
