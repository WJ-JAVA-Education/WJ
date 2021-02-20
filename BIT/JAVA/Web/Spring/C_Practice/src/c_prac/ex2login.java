package c_prac;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlImageInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.util.Cookie;
 
public class ex2login implements ILogin {
    public static Map<string, string=""> cookies;
    private static final String URL_LOGIN = "http://static.nid.naver.com/login.nhn";
 
    private boolean isLogin;
    private WebClient webClient;
    private HtmlPage currPage;
 
    @Override
    public Map<string, string=""> getCookies() {
        return makeLoginCookie();
    }
 
    @Override
    public boolean isLogin() {
        return isLogin;
    }
     
    public NaverLogin(String id, String pw) throws Exception {
        webClient = new WebClient(BrowserVersion.FIREFOX_38);
        webClient.waitForBackgroundJavaScript(5000);
        if(!login(id, pw)) {
            isLogin = false;           
            throw new Exception("cannot login with the id and pw");
        } else {
            isLogin = true;
        }
    }
     
    private Map<string, string=""> makeLoginCookie() {
        cookies = new HashMap<string, string="">();
        CookieManager cookieManager = webClient.getCookieManager();
        java.util.Set<cookie> cookieSet = cookieManager.getCookies();
        for(Cookie c : cookieSet) {
            cookies.put(c.getName(), c.getValue());
        }
         
        return cookies;
    }
     
    private boolean login(String naverId, String naverPw) throws Exception {
        currPage = webClient.getPage(URL_LOGIN);
         
        HtmlForm form = currPage.getFormByName("frmNIDLogin");
        HtmlTextInput inputId = form.getInputByName("id");
        HtmlPasswordInput inputPw = (HtmlPasswordInput)form.getInputByName("pw");
        HtmlImageInput button = (HtmlImageInput)form
                .getByXPath("//input[@alt='로그인']").get(0);
 
        inputId.setValueAttribute(naverId);
        inputPw.setValueAttribute(naverPw);
        currPage = (HtmlPage)button.click();
        return !currPage.asText().contains("Naver Sign in");
    }
}


출처: https://bugnote.tistory.com/48 [BUGNOTE - 기억 저장소]