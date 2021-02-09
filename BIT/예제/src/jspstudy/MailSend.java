package jspstudy;

public class MailSend {

	public void sendInfo() {
		String title = "JSPStudy�� YouTube ä�� �� new ������� �����α� �ҽ� ����";
		String content = "<h3>JSPStudy���� ���Ӱ� YouTube ä���� �����մϴ�.</h3>";
		content += "<a href='https://www.youtube.com/channel/UCVrhnbfe78ODeQglXtT1Elw'>";
		content += "<h3>1.JSPStudy ��ڰ� ���������ϴ� YouTube</h3></a>";
		content += "<img src='http://jspstudy.co.kr/main/images/youtube.jpg'>";
		content += "<br><br>";
		content += "<a href='http://jspstudy.co.kr/main/main.jsp?PATH=/admin/adminRead.jsp?a_num=165&m_num=7&keyField=a_division1&keyWord=notice'>";
		content += "<h3>2.JSP & Servlet �� ���α׷��� �Թ� ���� �ҽ�, PPT, ���α׷�</h3></a>";
		content += "<img src='http://jspstudy.co.kr/main/images/jsp_bookimg.jpg'>";
		content += "<br><br>";
		content += "<a href='http://jspstudy.co.kr/board/file/etc_03.pdf'>";
		content += "<h3>3.����� �������� �����α� �ҽ� ����</h3></a>";
		content += "<img src='http://jspstudy.co.kr/main/images/etc03_1.jpg'>";
		content += "<img src='http://jspstudy.co.kr/main/images/etc03_2.jpg'>";
		content += "<img src='http://jspstudy.co.kr/main/images/etc03_3.jpg'>";
		content += "<img src='http://jspstudy.co.kr/main/images/etc03_4.jpg'>";
		content += "<br><br>";
		content += "<h2>from : JSPStudy.co.kr</h2>";
		MemberMgr mgr = new MemberMgr();
		int total= mgr.getTotal();
		for (int i = 1; i <= total; i++) {
			String email = mgr.listEmail(i);
			GmailSend.send(title, content, email);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " Success~~");
		}
	}
	
	public static void main(String[] args) {
		MailSend ms = new MailSend();
		ms.sendInfo();
	}
}