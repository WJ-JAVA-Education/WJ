package edu_util.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		// set은 중복이 없고 , 순서도 자료구조 . Hashset 과 Treeset 이 있다.
		// set.add 를 사용시 boolean 값으로 던져 같은 값이 있는지 없는지 확인 후 반환
		
		
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3); // 이미 들어있기 때문에 false 를 반환한다.
		
		// 불린값으로 들어온 결과를 hasnext() 로 값이 있는지 없는지 확인 후 set1 안에 있는 true 값만 송출한다.
		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	
	}

}
