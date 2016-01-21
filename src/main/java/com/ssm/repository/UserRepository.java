package com.ssm.repository;

import java.util.List;

import com.ssm.domain.User;

public interface UserRepository extends BaseRepository<User, Long> {

	List<User> findAllByUserNameAndPassword(String userName, String password);

	List<User> findAllByUserName(String userName);

}
