package com.internousdev.ecsite.dto;

public class ItemListDTO {

	private int id;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String imageFilePath;
	private String imageFileName;
	private String insert_date;
	private String update_date;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemStock(){
		return itemStock;
	}

	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	public String getImageFilePath(){
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName(){
		return imageFileName;
	}

	public void setImageFileName(String imageFileName){
		this.imageFileName = imageFileName;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

	public String getUpdate_date(){
		return update_date;
	}

	public void setUpdate_date(String update_date){
		this.update_date = update_date;
	}

}
