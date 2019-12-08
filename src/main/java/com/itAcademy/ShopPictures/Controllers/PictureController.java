package com.itAcademy.ShopPictures.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itAcademy.ShopPictures.Domains.Pictures;
import com.itAcademy.ShopPictures.Domains.Shop;
import com.itAcademy.ShopPictures.Services.PictureService;

@RestController
public class PictureController {
	
	@Autowired
	private PictureService pictureService;
	
	//create a picture
	@PostMapping("/shops/{shopId}/pictures")
	public Pictures createPicture(@RequestBody Pictures picture, @PathVariable Long shopId) {
		return pictureService.addPicture(picture, shopId);
	}
	
	@GetMapping("/shops/{shopId}/pictures")
	public List<Pictures> getPicturesByShopId(@PathVariable Long shopId){
		return pictureService.listPictures(shopId);
	}
	
	@DeleteMapping("/shops/{shopId}/pictures")
	public String deletePicturesById(@PathVariable Long shopId) {
		pictureService.deletePictures(shopId);
		return "Pictures deleted";
	}
	
	

}
