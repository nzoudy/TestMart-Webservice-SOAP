package com.zoudys.business;

import java.util.ArrayList;
import java.util.List;

import com.zoudys.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		movieList.add("Oz the great and Powerful");
		movieList.add("Despicable");
		movieList.add("Star Trek Into Darkness");
		
	}

	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "book":
			return bookList;
		case "music":
			return bookList;
		case "movies":
			return bookList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product("java book", "1234", 99745.24));
		productList.add(new Product("Another book", "ABC", 1245));
		productList.add(new Product("Mathematics", "Edition Monge", 150));
		
		return productList;
	}
	
	
	
}





