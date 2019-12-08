package com.itAcademy.ShopPictures.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itAcademy.ShopPictures.Domains.Shop;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long>{

}
