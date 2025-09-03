package in.ashokIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokIt.entity.UserDtlsEntity;

public interface UserDtlsRepo extends JpaRepository<UserDtlsEntity, Integer>{

	 public UserDtlsEntity findByEmailAndPassword(String email,String password);
	 
	 public UserDtlsEntity findByEmail(String email);
}
