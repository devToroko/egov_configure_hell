package egovframework.sample.validator;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String name;
	private String email;
	private String password;
	private Date birthDate;
	private String profession;
	private String gender;
	private String note;
	private boolean married;
}
