package com.itAcademy.ShopPictures.Domains;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;

@Entity
public class Pictures {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pictureId;
	private String pictureName;
	private String pictureAuthor;
	private double picturePrice;
	private Date pictureDate;
	
	
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	


	public Pictures() {
		pictureDate = new Date();
		
	}
	
	public Pictures(String pictureName, String pictureAuthor, Long shopId) {
		super();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;
		pictureDate = new Date();
		this.shop = new Shop(shopId);
	}
	
	public Pictures(String pictureName, String pictureAuthor, Shop shop) {
		super();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;
		pictureDate = new Date();
		this.shop = shop;
	}

	
	public String getPictureAuthor() {
		return pictureAuthor;
	}

	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor;
	}

	public Long getPictureId() {
		return pictureId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public double getPicturePrice() {
		return picturePrice;
	}

	public void setPicturePrice(double picturePrice) {
		this.picturePrice = picturePrice;
	}

	public Date getPictureDate() {
		return pictureDate;
	}

	public void setPictureDate(Date pictureDate) {
		this.pictureDate = pictureDate;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	

}
