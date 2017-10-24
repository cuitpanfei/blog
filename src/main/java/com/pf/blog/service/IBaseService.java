package com.pf.blog.service;

import java.io.Serializable;

/**
 * 基本的增、删、改、查接口
 *
 * @param <T>
 * @author cuitpf
 */
public interface IBaseService<T> {
    T getObjectById(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(T entity);

    int updateByPrimaryKey(T entity);
}
