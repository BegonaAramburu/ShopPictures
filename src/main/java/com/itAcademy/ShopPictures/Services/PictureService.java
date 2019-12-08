package com.itAcademy.ShopPictures.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itAcademy.ShopPictures.Domains.Pictures;
import com.itAcademy.ShopPictures.Domains.Shop;
import com.itAcademy.ShopPictures.Repositories.PictureRepository;
import com.itAcademy.ShopPictures.Repositories.ShopRepository;

@Service
public class PictureService {
	
	@Autowired
	private PictureRepository pictureRepository;

	@Autowired
	private ShopService shopService;

	
	public Pictures addPicture(Pictures picture, Long shopId){
		Shop shop=shopService.getshop(shopId);
		picture.setShop(shop);
		pictureRepository.save(picture);
		return picture;
	}
	
	public List<Pictures> listPictures(Long shopId){
		List<Pictures> pictures = new ArrayList<>();
		return pictureRepository.findByShopShopId(shopId);
	}
	
	public void deletePictures(Long shopId) {
		List<Pictures> pictures = new ArrayList<>();
		pictures = pictureRepository.findByShopShopId(shopId);
		for(int i=0; i<pictures.size(); i++) {
			Pictures p = pictures.get(i);
			pictureRepository.delete(p);
		}
	}
}
