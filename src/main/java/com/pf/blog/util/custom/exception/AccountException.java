package com.pf.blog.util.custom.exception;

/**
 * Created by cuitpanfei on 2017/10/23.
 */
public class AccountException extends BaseException {
    public AccountException(String message) {
        super(message);
        LOGGER.info(getMessage());
    }
    public AccountException() {
        super(DEFULT_MESSAGE);
    }
}
