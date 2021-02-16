package edu_util.generic.list.exam;

import java.util.*;

public class ListExam{
	
    public List<String> addArray(String[]arr1, String[]arr2){
        List<String> list = new ArrayList<String>();
       
        
        
        for(String str : arr1){
            System.out.println(str);     
        }
        
        for(String str : arr2){
            System.out.println(str);
        }
        
        
        return list;
    }
    
    public static void main(String[] args){

    	List<String> list = new ArrayList<String>();
    	 list.add("kim");
         list.add("lee");
         
         for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
    	
    	
			
    }
}