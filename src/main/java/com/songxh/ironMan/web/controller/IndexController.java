package com.songxh.ironMan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * index controller
 *
 * @author hexiaosong
 * @date 2019-03-30
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/test")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/header")
    public String header(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + ":" + value);
        }
        return "ok";
    }
}
