package in.ashokIt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "State_Master")
@Data
public class StateMasterEntity {

	
	    @Id
	    private Integer stateId;
	    
	    private String stateName;
	    
	    private Integer countryId;
}
