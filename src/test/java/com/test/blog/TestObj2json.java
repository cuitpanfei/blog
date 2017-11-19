package com.test.blog;

import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.util.JsonUtil;
import org.junit.Test;

/**
 * Created by Administrator on 2017/11/1.
 */
public class TestObj2json {

    @Test
    public void testObj2Json(){
        System.out.println(JsonUtil.getInstance().json2obj(JsonUtil.getInstance().obj2json(new AccountAndUserWithBLOBs()),AccountAndUserWithBLOBs.class));
    }

}
