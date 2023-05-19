package com.projectJJ.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	User findById(long id);
	Optional<User> findByUserName(String userName);
	Optional<User> findByUserNameAndPassword(String userName, String password);
}
