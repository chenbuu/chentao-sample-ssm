package com.ssm.repository;

import java.util.List;

import com.ssm.domain.User;

public interface UserRepository extends BaseRepository<User, String> {

	List<User> findAllByUserNameAndPassword(String userName, String password);

	List<User> findAllByUserName(String userName);

}
