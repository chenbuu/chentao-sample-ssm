package com.ssm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 角色
 * @author ChenTao
 * @date 2016年1月21日下午4:12:31
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Role implements java.io.Serializable {

	private static final long serialVersionUID = -3249696465848020196L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * 角色名称
	 */
	private String name;

}