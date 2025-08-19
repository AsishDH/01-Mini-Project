package in.ashokIt.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SignUp {

	
	private String firstName;
	private String lastName;
	private String email;
	private String phNo;
	private LocalDate date;
	private String gender;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
}
