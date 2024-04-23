package com.akai.controller;

import com.akai.pojo.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    /*
    * @ResponseBody
    * 1 方法的返回值不再作为页面跳转依据,而是直接作为返回的数据
    * 2 将方法返回的数据自动转换为JSON
    * */
    @ResponseBody
    @RequestMapping("/testJson")
    public User testJson() {
        User user = new User();
        user.setUname("cao");
        user.setUage(19);
        return user;    // {"uname":"cao","uage":19,"uhobby":null,"birthday":null,"pets":null}
    }
    @RequestMapping("/testRestController")
    public User testRestController() {
        User user = new User();
        user.setUname("akai");
        user.setUage(19);
        return user;    // {"uname":"akai","uage":19,"uhobby":null,"birthday":null,"pets":null}
    }
}
