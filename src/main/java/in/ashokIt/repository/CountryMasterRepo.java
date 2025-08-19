package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokIt.entity.CountryMasterEntity;

public interface CountryMasterRepo  extends JpaRepository<CountryMasterEntity, Integer>{

}
