package com.pf.blog.dao;

public interface IBaseSelectiveDao<T> {
    /**
     * 自定义插入（有值字段才插入）
     *
     * @param entity 对象实体
     * @return
     */
    int insertSelective(T entity);

    /**
     * 自定义修改（有值字段才修改）
     *
     * @param entity
     * @return
     */
    int updateByPrimaryKeySelective(T entity);
}
