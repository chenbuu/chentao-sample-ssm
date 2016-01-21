package com.ssm.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 要求数据库操作类继承该类
 *
 * @author ChenTao
 * @param <T> Entity class
 * @param <ID> id class of the entity, usually java.lang.Long
 */
//this interface should not be instantiate, the annotation NoRepositoryBean is required,
//all of our repository may extends this interface for convinent
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

}
