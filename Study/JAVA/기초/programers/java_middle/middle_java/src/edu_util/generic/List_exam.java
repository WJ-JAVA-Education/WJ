package edu_util.generic;

import java.util.ArrayList;
import java.util.List;

public class List_exam {

	public static void main(String[] args) {
		// List 는 데이터의 중복이 있을수도 있고 , 순서도 있다.
		
		// 배열의 경우는 한번 생성하면 크기 변경 불가이나
		// List의 경우는 저장공간이 필요에따라 쥬
		
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		for (int i = 0 ; i < list.size() ; i++) {
			String str = list.get(i);
			System.out.println(str);
			
		}
		
		
		};
		
	}

