package c_prac;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex1 {

	/*
     *	Document 클래스 : 연결해서 얻어온 HTML 전체 문서
     *	Element 클래스  : Documnet의 HTML 요소
     *	Elements 클래스 : Element가 모인 자료형
	 */
	
	public static void main(String[] args) {
		// Jsoup를 이용해서 네이버 스포츠 크롤링
		String url = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 주요 뉴스로 나오는 태그를 찾아서 가져오도록 한다.
		Elements element = doc.select("div.qr_once_inner");
		
		// 1. 헤더 부분의 제목을 가져온다.
		String title = element.select("p").text();

		System.out.println("============================================================");
		System.out.println(title);
		System.out.println("============================================================");
		
		
		
		for(Element el : element) {	// 하위 뉴스 기사들을 for문 돌면서 출력
			Elements el1 = element.select("p");
			System.out.println(el1.text());
		}
		
		System.out.println("============================================================");
	}

}


