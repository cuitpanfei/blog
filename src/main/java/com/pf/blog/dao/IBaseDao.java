package com.pf.blog.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 基本的增、删、改、查类
 *
 * @param <T>
 * @author cuitpf
 */
public interface IBaseDao<T> {

    List<T> selectBySearch(String mkName);

    int deleteByPrimaryKey(Integer id);

    int insert(T entity);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(T entity);
}
