package com.itAcademy.ShopPictures.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itAcademy.ShopPictures.Domains.Pictures;
import com.itAcademy.ShopPictures.Domains.Shop;

@Repository
public interface PictureRepository extends CrudRepository<Pictures, Long> {

	public List<Pictures> findByShopShopId(Long shopId);
	public List<Pictures> deleteByShopShopId(Long shopId);

}
