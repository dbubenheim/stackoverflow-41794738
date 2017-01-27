package com.stackoverflow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.bubenheim@gmail.com
 */
@RestController
public class MyController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}