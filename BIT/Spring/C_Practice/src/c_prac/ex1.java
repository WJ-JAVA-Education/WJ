package c_prac;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ex1 {
	login log = new login();

	public static void main(String[] args) {
		String url = "http://www.thevapor.co.kr/";
		try {
			Document doc =	Jsoup.connect(url).get();
			Elements html = doc.select("a");
			for (Element element : html) {
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}		
}
