package com.itAcademy.ShopPictures.Controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itAcademy.ShopPictures.Domains.Pictures;
import com.itAcademy.ShopPictures.Domains.Shop;
import com.itAcademy.ShopPictures.Services.ShopService;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	//Create shop
	@PostMapping("/shops")
	public Shop createShop(@RequestBody Shop shop) {
		shopService.addShop(shop);
		return shop;
	}
	
	//Return list shops
	@GetMapping("/shops")
	public List<Shop> listShops(){
		return shopService.getShops();
	}
	
	//Return shop by id
	@GetMapping("/shops/{shopId}")
	public Shop shopById(@PathVariable Long shopId){
		return shopService.getshop(shopId);
	}
	

}