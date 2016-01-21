package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ssm.domain.User;

/**
 * 
 * @author ChenTao
 * @date 2016年1月21日下午2:07:41
 */
public interface UserMapper extends MybatisMapper {

	@Select("select id, user_name from t_user where user_name = ${userName} ")
	List<User> findAllByUserName(@Param("userName") String userName);
}
