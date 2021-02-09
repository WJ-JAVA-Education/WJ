package collection;

import java.util.ArrayList;


public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("재우");
		list.add("개발은 재밌다.");
		list.add("어레이 리스트의 사용법을 알았다!");
		list.add("리스트를 잘 사용해보자!");
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		System.out.println(list);
		list.remove(3);
		list.clear();
		boolean b = list.isEmpty();
		
		System.out.println(b);
		list.add("재으");
		list.set(0, "우재");
		System.out.println(list.get(0));
		
		list2 = (ArrayList<String>) list.clone();
		System.out.println(list2);
	}

	
	
}
