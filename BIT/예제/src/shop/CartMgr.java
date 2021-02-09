package shop;

import java.util.Hashtable;

//��ٱ��� ��� : DB���� �ƴϰ� ������ �̿�
public class CartMgr {

	//key : ��ǰ��ȣ, value : �ֹ���ü
	private Hashtable<Integer, OrderBean> hCart = 
			new Hashtable<Integer, OrderBean>();
	
	//Cart Add
	public void addCart(OrderBean order) {
		int productNo/*��ǰ��ȣ*/ = order.getProductNo();
		int quantity/*�ֹ�����*/ = order.getQuantity();
		if(quantity>0) {
			//������ hCart�� ��ǰ�� �ִ��� ������ �˻�
			if(hCart.containsKey(productNo)) {//�ִ� ���
				//������ ����� �ֹ���ü�� �����´�.
				OrderBean temp = hCart.get(productNo);
				//������ ������ ���ο� �ֹ��� ���� ���Ѵ�.
				quantity+=temp.getQuantity();
				//���濡 ������ �ֹ���ü �ٽ� setter
				order.setQuantity(quantity);
				//������ ������ ��ü�� hCart ����
				hCart.put(productNo, order);
			}else {
				//���� ���
				hCart.put(productNo, order);
			}
		}
	}
	
	//Cart Update : ������ hCart�� ���� �ִ��� ����� ��.
	public void updateCart(OrderBean order) {
		//����ڽ� : int -> Integer
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









