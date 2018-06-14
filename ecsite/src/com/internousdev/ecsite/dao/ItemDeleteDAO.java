package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteDAO {

	public List<ItemListDTO> itemDelete(String id) throws SQLException{
		List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM item_info_transaction WHERE id=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItemStock(resultSet.getInt("item_stick"));
				itemList.add(dto);

			}
		}catch (SQLException e){
			e.printStackTrace();
		} finally{
			connection.close();
		}

		return itemList;


	}

}

