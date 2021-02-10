package c_prac;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex1 {

	public static void main(String[] args) {
		String url = "https://toma0912.tistory.com/74";
		try {
			Document doc =	Jsoup.connect(url).get();
			Elements html = doc.select("p");
			Elements html2 = html.select("p");
			for (Element element : html2) {
				element.toString().replaceAll("<P>","");
				System.out.println(html2);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}		
}
