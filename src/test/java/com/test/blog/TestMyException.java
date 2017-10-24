package com.test.blog;

import com.alibaba.fastjson.JSON;
import com.pf.blog.entity.User;
import com.pf.blog.util.custom.exception.AccountException;
import org.junit.Test;

/**
 * Created by Administrator on 2017/10/23.
 */
public class TestMyException {
    @Test
    public void test() {
        new AccountException("ERROR");
    }
}
