package com.itAcademy.ShopPictures.Domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long shopId;
	private String shopName;
	private int capacity;


	public Shop(Long shopId) {
		this.shopId = shopId;
	}
	
	public Shop() {
	}
	public Shop(String shopName, int capacity) {
		this.shopName = shopName;
		this.capacity = capacity;
		
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	
}
