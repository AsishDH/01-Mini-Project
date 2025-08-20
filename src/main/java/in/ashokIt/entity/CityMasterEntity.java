package in.ashokIt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "city_dtls")
@Data
public class CityMasterEntity {

	   @Id
	   private Integer cityId;
	   
	   private String cityName;
	   
	   private Integer stateId;
}
