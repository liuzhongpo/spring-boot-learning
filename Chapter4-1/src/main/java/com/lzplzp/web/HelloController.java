package com.lzplzp.web;

import com.lzplzp.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 如果没有全局的异常处理器拦截，Spring Boot提供了一个默认的映射：/error，当处理中抛出异常之后，会转到该请求中处理，并且该请求有一个全局的错误页面用来展示异常内容
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        throw new RuntimeException("发生错误");
    }

    /**
     * 发生异常，返回json
     * @return
     * @throws MyException
     */
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
