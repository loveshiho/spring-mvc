package com.akai.controller;

import com.akai.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ReceivePojoDataController {
    @RequestMapping("/getDataByPojo")
    /*
     * 使用POJO接收参数时,注意事项
     * 提交的参数名必须和POJO的属性名保持一致
     * springmvc底层通过反射给参数列表的属性赋值
     * 通过set方法设置属性值的,不是直接通过操作属性
     * POJO的属性一定要有set方法,要不然就会接收失败
     * */
    public String getDataByPojo(User user) {
        System.out.println(user);   // User(uname=cao, uage=18, uhobby=[1, 2, 3])
        return "nice~";
    }
    @RequestMapping("/getDataByDate")
    public String getDataByPojo2(@RequestParam("birthday") @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println(birthday);
        return "nice~";
    }
}
