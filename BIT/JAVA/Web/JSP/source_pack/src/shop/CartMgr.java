package shop;

import java.util.Hashtable;

//장바구니 기능 : DB연동 아니고 세션을 이용
public class CartMgr {

	//key : 상품번호, value : 주문객체
	private Hashtable<Integer, OrderBean> hCart = 
			new Hashtable<Integer, OrderBean>();
	
	//Cart Add
	public void addCart(OrderBean order) {
		int productNo/*상품번호*/ = order.getProductNo();
		int quantity/*주문수량*/ = order.getQuantity();
		if(quantity>0) {
			//기존에 hCart에 상품이 있는지 없는지 검사
			if(hCart.containsKey(productNo)) {//있는 경우
				//기존에 저장된 주문객체를 가져온다.
				OrderBean temp = hCart.get(productNo);
				//기존에 수량과 새로운 주문에 수량 더한다.
				quantity+=temp.getQuantity();
				//변경에 수량을 주문객체 다시 setter
				order.setQuantity(quantity);
				//수량이 증가된 객체를 hCart 저장
				hCart.put(productNo, order);
			}else {
				//없는 경우
				hCart.put(productNo, order);
			}
		}
	}
	
	//Cart Update : 기존에 hCart에 값이 있더라도 덮어쓰기 됨.
	public void updateCart(OrderBean order) {
		//오토박싱 : int -> Integer
		hCart.put(order.getProductNo(), order);
	}
	//Cart Delete
	public void deleteCart(OrderBean order) {
		hCart.remove(order.getProductNo());
	}
	//Cart List
	public Hashtable<Integer, OrderBean> getCartList(){
		return hCart;
	}
}









