package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public List<ItemListDTO> getItemList() throws SQLException{
		List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItemStock(resultSet.getInt("item_stock"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setImageFileName(resultSet.getString("image_file_name"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				dto.setUpdate_date(resultSet.getString("update_date"));
				itemList.add(dto);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return itemList;
	}

	public ItemListDTO getItemInfo(int id){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ItemListDTO itemListDTO = new ItemListDTO();

		String sql = "SELECT * FROM item_info_transaction WHERE id=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				itemListDTO.setId(resultSet.getInt("id"));
				itemListDTO.setItemName(resultSet.getString("item_name"));
				itemListDTO.setItemPrice(resultSet.getInt("item_price"));
				itemListDTO.setItemStock(resultSet.getInt("item_stock"));
				itemListDTO.setImageFilePath(resultSet.getString("image_file_path"));
				itemListDTO.setImageFileName(resultSet.getString("image_file_name"));
				itemListDTO.setInsert_date(resultSet.getString("insert_date"));
				itemListDTO.setUpdate_date(resultSet.getString("update_date"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}

		return itemListDTO;
	}

}
