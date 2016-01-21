package com.ssm.test.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ssm.Application;
import com.ssm.domain.User;
import com.ssm.dto.UserDto;
import com.ssm.mapper.UserMapper;
import com.ssm.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据库数据模拟
 * @author ChenTao
 * @date 2015年11月19日下午9:42:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@Slf4j
public class UserTest {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Test
	public void findAll() throws Exception {
		System.out.println("--------------findAll-----------------");
		for (User model : userRepository.findAll()) {
			log.debug("{}", new UserDto(model));
		}
		System.out.println("-------------------------------");
	}

	@Test
	public void findAll2() throws Exception {
		System.out.println("--------------findAll2-----------------");
		for (User model : userMapper.findAllByUserName("2")) {
			log.debug("{}", new UserDto(model));
		}
		System.out.println("-------------------------------");
	}

}
