package com.pf.blog.dao;

import java.io.Serializable;

/**
 * 基本的增、删、改、查类
 *
 * @param <T>
 * @author cuitpf
 */
public interface IBaseDao<T> {

    int deleteByPrimaryKey(Integer id);

    int insert(T entity);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(T entity);
}
