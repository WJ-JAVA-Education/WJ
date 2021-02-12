package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class practice1 {

	public static void main(String[] args) throws IOException {
		String url = "http://www.thevapor.co.kr/category/%EB%94%94%EC%A0%80%ED%8A%B8%EC%9D%8C%EC%8B%9D%ED%96%A5/37/";
		
			Document doc = Jsoup.connect(url).get();
			
			
			String el = doc.getElementsByClass("item xans-record-").select("a").text().replaceAll("상품명 : ","\n");
			
			String a = "http://www.thevapor.co.kr";
			List<String> el2 = doc.getElementsByClass("item xans-record-").select("a").eachAttr("href");
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < el2.size(); i++) {
					sb.append(a + el2.get(i));
					sb.append("\n");
				}
			System.out.println(sb);
			StringTokenizer tk = new StringTokenizer(sb.toString());
			List<String> listTk = new ArrayList<String>();
			try {
				while(tk.hasMoreTokens()) {
					listTk.add((String) tk.nextElement());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int i = 0; i < listTk.size(); i++) {
				Document doc2 = Jsoup.connect(listTk.get(i)).get();
				System.out.println(doc2);
			}

			
			
	}
	}
