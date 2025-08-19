package in.ashokIt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user_dtls")
public class UserDtlsEntity {

	   @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)	  
	   private Integer userId;
	   
	   private String firstName;
	   
	   private String lastName;
	   
	   private String email;
	   
	   private String userPwd;
	   
	   private String userMobile;
	   
	   private LocalDate dob;
	   
	   private String gender;
	   
	   private Integer cityId;
	   private Integer stateId;
	   private Integer countryId;
	   
	   private String accStatus;
	   private LocalDate createData;
	   private LocalDate updateDate;
	   
}
