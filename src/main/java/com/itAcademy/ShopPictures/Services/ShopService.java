package com.itAcademy.ShopPictures.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itAcademy.ShopPictures.Domains.Pictures;
import com.itAcademy.ShopPictures.Domains.Shop;
import com.itAcademy.ShopPictures.Repositories.PictureRepository;
import com.itAcademy.ShopPictures.Repositories.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private PictureRepository pictureRepository;
	
	//create shop
	public void addShop(Shop shop) {
		shopRepository.save(shop);
	}
	
	//Shop List
	public List<Shop> getShops(){
		return (List<Shop>) shopRepository.findAll();
	}
	
	//Shop by Id
	public Shop getshop(Long shopId) {
		Shop shop = null;
		Optional<Shop> shopOptional = shopRepository.findById(shopId);
		if(shopOptional.isPresent()) {
			shop = shopOptional.get();
		}else {
			System.out.println("Shop not found");
		}
		return shop;
	}
}
