package practice;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class practice1 {

	public static void main(String[] args) throws IOException {
		String url = "http://www.thevapor.co.kr/category/%EB%94%94%EC%A0%80%ED%8A%B8%EC%9D%8C%EC%8B%9D%ED%96%A5/37/";
		
			Document doc = Jsoup.connect(url).get();
			
			List<String> list = new ArrayList<String>();
			
			String el = doc.getElementsByClass("item xans-record-").select("a").text().replaceAll("상품명 : ","\n");
			
			
				List<String> el2 = doc.getElementsByClass("item xans-record-").select("a").eachAttr("href");
				for (String string : el2) {
					System.out.println("http://www.thevapor.co.kr"+string);
				}
			
			ArrayList<StringBuffer> list3 = new ArrayList<StringBuffer>();
			for (int i = 0; i < el2.size();i++) {
				
			}
			
			
			
			
			
			
	}

		
		
		
		
	}
