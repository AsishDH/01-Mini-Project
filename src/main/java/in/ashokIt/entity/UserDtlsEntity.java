package in.ashokIt.entity;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
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
	   
	   @Column(name = "first_name")
	   private String firstName;
	   
	   @Column(name = "last_name")
	   private String lastName;
	   
	   @Column(name = "email")
	   private String email;
	   
	   @Column(name = "pwd")
	   private String password;
	   
	   @Column(name = "user_mobile_number")
	   private String userMobileNumber;
	   
	   @Column(name = "date_of_birth")
	   private LocalDate dob;
	   
	   @Column(name = "gender")
	   private String gender;
	   
	   @Column(name = "city_id")
	   private Integer cityId;
	   @Column(name = "state_id")
	   private Integer stateId;
	   @Column(name = "country_id")
	   private Integer countryId;
	   
	   @Column(name = "acc_status")
	   private String accStatus;
	   
	   @CreatedDate
	   @Column(name = "create_date",updatable = false)
	   private LocalDate createData;
	   
	   @UpdateTimestamp
	   @Column(name = "update_date",insertable =false)
	   private LocalDate updateDate;
	   
}
