<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
    request.setCharacterEncoding("UTF-8"); // 한글처리
    

	MultipartRequest multi = new MultipartRequest(request, "D:\\upload", 5 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());

	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	String filename = multi.getFilesystemName("productImage");// 파일의 이름을 가져온다.
	
	Integer price;
	
	if (unitPrice.isEmpty())
	    price = 0;
	else
	    price = Integer.valueOf(unitPrice);
	
	long stock;
	
	if (unitsInStock.isEmpty())
	    stock = 0;
	else
	    stock = Long.valueOf(unitsInStock);
	
	Enumeration files = multi.getFileNames();
	String fname = (String) files.nextElement();
	
	
	ProductRepository dao = ProductRepository.getInstance();
	
	Product newProduct = new Product();
	
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);
	newProduct.setFilename(filename);		// 저장된 이미지의 파일 이름을 저장
	
	dao.addProduct(newProduct);
	
	response.sendRedirect("products.jsp");
	%>