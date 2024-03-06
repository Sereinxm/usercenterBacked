package com.example.backed.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author cao
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -4032455263587934947L;
    String userAccount;
    String userPassword;
    String checkPassword;

}
