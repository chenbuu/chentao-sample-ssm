package com.ssm.domain;
// default package

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 权限分配
 * @author ChenTao
 * @date 2016年1月21日下午4:16:53
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class PermInstance implements java.io.Serializable {

	private static final long serialVersionUID = 5217441897592911949L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * 一个Role对应多个Permission的权限
	 */
	@ManyToOne
	private Role role;

	/**
	 * 
	 */
	@ManyToOne
	private Permission permission;

}