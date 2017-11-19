package com.test.blog;

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
