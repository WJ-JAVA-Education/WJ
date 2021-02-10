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
			Elements html = doc.select("div");
			Elements html2 = html.select("p");
			for (Element element : html) {
				System.out.println(html.text());
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}		
}
