package in.ashokIt.entity;

import jakarta.persistence.Id;

public class CityMasterEntity {

	   @Id
	   private Integer cityId;
	   
	   private String cityName;
	   
	   private Integer stateId;
}
