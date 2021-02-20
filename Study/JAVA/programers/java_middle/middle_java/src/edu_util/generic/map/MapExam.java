package edu_util.generic.map;

import java.util.*;

public class MapExam{
	
    public Map<Integer, String> makeMap(){
        Map<Integer,String> products = new HashMap<>();
        //상품의 이름과 값을 products에 추가해 보세요.
        products.put(001,"kim");
        products.put(002,"lee");
        products.put(003,"choi");
        products.put(004,"kang");
        return products;
    }
    
    public static void main(String[] args){
    	 Map<Integer,String> products = new HashMap<>();
         //상품의 이름과 값을 products에 추가해 보세요.
         products.put(001,"kim");
         products.put(002,"lee");
         products.put(003,"choi");
         products.put(004,"kang");
         System.out.println(products.get(001));
         
    }
}