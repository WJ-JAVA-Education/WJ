package tour;

import java.util.Hashtable;

public class CartMgr {
	
	//Integer : 상품번호(productNo)
	private Hashtable<Integer,OrderBean> hCart = new Hashtable<>();
	
	//Cart Insert
	public void addCart(OrderBean order/*새로운 장바구니*/) {
		int productNo = order.getProductNo();
		int quantity1/*주문수량*/ = order.getQuantity1();
		int quantity2/*주문수량*/ = order.getQuantity2();
		int quantityTotal = quantity1+quantity2;
		String tourdate = order.getTourdate();
		String tourtime = order.getTourtime();
		if(quantityTotal>0) {
			//cart에 기존에 저장된 것이 있다면
			if(hCart.containsKey(productNo)) {
				//기존에 저장된 주문객체
				OrderBean temp = hCart.get(productNo);
				//새로운 주문의 수량 + 기존의 주문 수량
				quantity1+=temp.getQuantity1();
				quantity2+=temp.getQuantity2();
				quantityTotal = quantity1+quantity2;
				//order 객체에 합쳐진 주문 수량 setter
				order.setQuantity1(quantity1);
				order.setQuantity2(quantity2);
				order.setQuantityTotal(quantityTotal);
				//카트에 다시 저장하면 기존에 주문객체는 덮어쓰기 된다.
				if(!temp.getTourdate().equals(tourdate)) {
					tourdate = temp.getTourdate();
					order.setTourdate(tourdate);
				}
				if(!temp.getTourtime().equals(tourtime)) { 
					tourtime = temp.getTourtime();
					order.setTourtime(tourtime);
				}
				hCart.put(productNo, order);
			}else {
				//기존에 저장이 없다면
				hCart.put(productNo, order);
			}
		}
	}
	
	//Cart Update
	public void updateCart(OrderBean order) {
		int productNo = order.getProductNo();
		//동일한 key값은 덮어쓰기
		hCart.put(productNo/*Auto Boxing*/, order);
	}
	
	//Cart Delete
	public void deleteCart(OrderBean order) {
		int productNo = order.getProductNo();
		hCart.remove(productNo);
	}
	
	//Cart List
	public Hashtable<Integer,OrderBean> getCartList() {
		return hCart;
	}
}
