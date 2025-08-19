package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokIt.entity.StateMasterEntity;

public interface StateMasterRepo extends JpaRepository<StateMasterEntity, Integer> {

}
