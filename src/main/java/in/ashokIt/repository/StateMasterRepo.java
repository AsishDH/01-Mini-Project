package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokIt.entity.StateMasterEntity;

@Repository
public interface StateMasterRepo extends JpaRepository<StateMasterEntity, Integer> {

}
