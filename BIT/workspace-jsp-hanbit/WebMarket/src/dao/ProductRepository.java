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
	
	public ProductRepository() {  //임의로 3개의 제품을 생성
		//첫번째 제품 1.핸드폰
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		//2.노트북
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		//3.태블릿
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		//어레이 리스트 listOfProducts에 추가
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts; //생성된 리스트(핸드폰,노트북,태블릿)를 리턴
	}
	
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
	// 새로 등록된 제품을 리스트에 추가한다.
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}










