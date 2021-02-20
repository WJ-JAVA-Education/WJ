package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<>();
	//싱글톤 패턴
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;  //객체 생성 대신에 getInstance
	}
	
	public ProductRepository() {  
		//임의로 3개의 제품을 생성=>DB의 제품을 불러올것
	}

	//DB에서 SELECT * FROM product로 가져온다.
	public ArrayList<Product> getAllProducts() {
		return listOfProducts; //생성된 리스트(핸드폰,노트북,태블릿)를 리턴
	}
	
	//=> SELECT * FROM product where id='제품아이디';
	//아이디로 리스의 제품을 검색해서 제품 객체를 리턴한다.
	public Product getProductById(String productId) {
		Product productById = null;
		// 리스트의 제품들을 하나씩 반복문을 실행한다.
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}	
		return productById;
	}
	
	// 새로 등록된 제품을 DB에 저장한다.!
	// 새로 등록된 제품을 리스트에 추가한다.
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}










