package egovframework.sample.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SampleVO {
	private String id;
	private String title;
	private String regUser;
	private String content;
	private Date regDate;
	
	@Builder
	public SampleVO(String id, String title, String regUser, String content, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.regUser = regUser;
		this.content = content;
		this.regDate = regDate;
	}
	
}