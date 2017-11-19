package com.pf.blog.dao;

import com.pf.blog.entity.Replay;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplayMapper extends IBaseDao<Replay>, IBaseSelectiveDao<Replay>{
    int updateByPrimaryKeyWithBLOBs(Replay record);
}
