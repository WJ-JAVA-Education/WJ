package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class google {

	public static void main(String[] args) throws IOException {
		String url = "https://www.google.com/search?q=%EA%B0%80%EC%A0%B8%EC%98%A4%EA%B8%B0&tbm=isch&ved=2ahUKEwjtwoTApuLuAhVH4ZQKHeJOBdEQ2-cCegQIABAA&oq=%EA%B0%80%EC%A0%B8%EC%98%A4%EA%B8%B0&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADIECAAQGDoHCCMQ6gIQJzoFCAAQsQNQnNMbWNbkG2C55RtoAXAAeACAAe0BiAG5CJIBBTAuNi4xmAEAoAEBqgELZ3dzLXdpei1pbWewAQrAAQE&sclient=img&ei=1GElYO2IEMfC0wTinZWIDQ&bih=1297&biw=2560";
		
			Document doc = Jsoup.connect(url).get();
			
			List<String> list = new ArrayList<String>();
			
			String el = doc.getElementsByClass("islrg").select("a").text().replaceAll("상품명 : ","\n");
			
			try {
				Elements el2 = doc.select("img");
				for (Element element: el2) {
					List<String> el3 = el2.eachAttr("src");
					System.out.println(el3);
					Thread.sleep(2000);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
	}

		
		
		
		
	}
