package practice;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class google {

	public static void main(String[] args) throws IOException {
		crawl("한국");
	}
	
	public static void crawl(String Search)throws IOException {
		String URL ="https://www.google.com/search?q="+Search+"&tbm=nws";
		String GOOGLE ="https://www.google.com";
		
		//검색 된 페이지의 페이지를 가져오는 과정
		Document SearchPage = Jsoup.connect(URL).get();
		List<String> pagelink = SearchPage.getElementsByClass("AaVjTc").select("a").eachAttr("href");
		
		// pagelink 를 배열에 담는 과정
		String[] pagearr = new String[pagelink.size()];
		for (int i = 0; i < pagelink.size(); i++) {
			pagearr[i] = GOOGLE+pagelink.get(i);
		}
		
		// 구글 해당 검색어의 뉴스를 가져오는 과정
		
		  for (int i = 0; i < pagearr.length; i++) {
		  Document doc = Jsoup.connect(pagearr[i]).get(); 
		  List<String> el = doc.getElementsByClass("JheGif nDgy9d").eachText(); 
		  List<String> el2 = doc.getElementsByClass("dbsr").select("a").eachAttr("href"); 
		  for (int j = 0; j < el.size(); j++) {
			  System.out.println();
			  System.out.println(el.get(j)+"\n"+el2.get(j));
		  }
		}
	}
	
	
	
	
	
	
}
