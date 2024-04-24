package com.akai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 哈哈哈,你还真是个小丑,检查半天代码,User一直为 null,原来是实体类都没写
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
}
