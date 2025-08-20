package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.CityMasterEntity;

@Repository
public interface CityMasterRepo  extends JpaRepository<CityMasterEntity, Integer>{

}
