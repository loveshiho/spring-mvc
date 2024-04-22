package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testGet(@PathVariable("id") Integer id) {
        System.out.println(id);
        System.out.println("testGet success~");
        return "nihao";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.POST)
    public String testPost(@PathVariable("id") Integer id) {
        System.out.println(id);
        System.out.println("testPost success~");
        return "nihao";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testPut(@PathVariable("id") Integer id) {
        System.out.println(id);
        System.out.println("testPut success~");
        return "nihao";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testDelete(@PathVariable("id") Integer id) {
        System.out.println(id);
        System.out.println("testDelete success~");
        return "nihao";
    }
}
