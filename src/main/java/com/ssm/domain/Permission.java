package com.ssm.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ssm.enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 权限种类
 * @author ChenTao
 * @date 2016年1月21日下午4:13:44
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Permission implements java.io.Serializable {

	private static final long serialVersionUID = 8986728060324547747L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * 状态StatusEnum
	 */
	private StatusEnum status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 名称
	 */
	private String name;

}