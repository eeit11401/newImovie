package com.web.store.service;

import java.util.List;
import java.util.Map;

import com.web.store.model.CartOrderBean;
import com.web.store.model.FoodBean;
import com.web.store.model.FoodBeanWithImageData;
import com.web.store.model.MovieBean;
import com.web.store.model.MovieBeanWithImageData;
import com.web.store.model.RoomBean;
import com.web.store.model.RoomBeanWithImageData;

public interface ProductServiec {
	
	//List<Map<String, String>> getAllCategories();
	List<String> getAllCategories(); 
	List<FoodBean> getAllProducts();	
	List<FoodBean> getFoodType() ;
	List<FoodBean> getFoodByCategory(String category);
	public FoodBean getProductById(int productId);
	

	List<String> getAllCategories1();
	List<MovieBean> getAllProducts1();
	List<MovieBean> getProductsByCategory1(String category);
	public MovieBean getProductById1(int productId);
		List<RoomBean> getAllProducts2();
	List<String> getAllCategories2();
	List<RoomBean> getProductsByCategory2(String category);
	public RoomBean getProductById2(int productId);

	List<FoodBeanWithImageData> getAllFoodsWithImageData();
	List<MovieBeanWithImageData> getAllMoviesWithImageData();
	List<RoomBeanWithImageData> getAllRoomsWithImageData();

	List<FoodBean> getSelectfoods(Integer foodTypeId);
	List<FoodBean> getSelectfoodTypes();

	List<MovieBean> getSelectmovies(Integer movieTypeId);
	List<MovieBean> getSelectmovieTypes();
	
	List<RoomBean> getSelectrooms(Integer roomNameId);
	List<RoomBean> getSelectroomTypes();
	//新增的---------------
	void cartToDB(CartOrderBean cob);

}