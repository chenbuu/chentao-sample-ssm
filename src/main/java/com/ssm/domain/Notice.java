package com.ssm.domain;

import java.io.Serializable;

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
 * 消息
 * @author ChenTao
 * @date 2016年1月21日下午4:00:04
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Notice implements Serializable {

	private static final long serialVersionUID = 8237066310899274180L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 正文
	 */
	private String content;
}
