package com.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.ssm.mapper.MybatisMapper;

/**
 * 启动类
 * @author ChenTao
 * @date 2015年8月12日下午8:07:19
 */
@SpringBootApplication
@MapperScan(basePackageClasses = MybatisMapper.class, markerInterface = MybatisMapper.class)
public class Application extends SpringBootServletInitializer {

	/**
	 * 主方法
	 * @author ChenTao
	 * @date 2015年8月12日下午8:07:41
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	/**
	 * 部署时候调用
	 * @author ChenTao
	 * @date 2015年8月12日下午8:07:19
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

}
