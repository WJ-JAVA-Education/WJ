package WooJ.Gogo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestDB {
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column	private String title;
	@Column	private String content;

	public TestDB(String title, String content) {
		this.title = title;
		this.content = content;
	}

}
