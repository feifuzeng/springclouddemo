package com.feifz.eurekaconsumer.control;

import com.feifz.eurekaconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/3 14:30
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam (value = "name", defaultValue = "Micheal Jordan")String name){
        return helloService.hiService(name);
    }
}
