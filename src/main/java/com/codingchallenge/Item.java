package com.codingchallenge;

public class Item {

	private String Sku;
	private Integer price;

	public Item(String Sku, Integer price){
		this.Sku = Sku;
		this.price = price;
	}

	// getters and setters
	public String getSku(){
		return this.Sku;
	}
	public void setSku(String Sku){
		this.Sku=Sku;
	}
	public Integer getPrice(){
		return this.price;
	}
	public void setPrice(Integer price){
		this.price=price;
	}
}
