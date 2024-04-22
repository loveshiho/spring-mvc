package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
    @RequestMapping("/testPathController/{id}/{name}")
    public String testPathController(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        // 意思就是要将路径里面 id这一部分解析出来，放到 Integer id上去，name这一部分解析出来，放到 String name上去
        System.out.println(id + " : " + name);  // 1 : cao
        System.out.println("hi~");
        return "nihao";
    }
}
