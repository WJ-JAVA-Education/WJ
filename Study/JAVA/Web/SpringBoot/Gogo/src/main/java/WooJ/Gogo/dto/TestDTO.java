package WooJ.Gogo.dto;

import WooJ.Gogo.entity.TestDB;

public class TestDTO {

	String title;
	String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TestDTO(String title, String content) {
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "TestDTO [title=" + title + ", content=" + content + "]";
	}
	
	public TestDB tdbc() {
		return new TestDB(title,content);
	}

}
