package com.zoudys;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.zoudys.model.Product;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", 
serviceName="TestMartCatalogService", targetNamespace="http://testmart.zoudys.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	public abstract List<Product> getProductsv2(String category);

}