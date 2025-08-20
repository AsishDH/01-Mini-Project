package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.CountryMasterEntity;

@Repository
public interface CountryMasterRepo  extends JpaRepository<CountryMasterEntity, Integer>{

}
