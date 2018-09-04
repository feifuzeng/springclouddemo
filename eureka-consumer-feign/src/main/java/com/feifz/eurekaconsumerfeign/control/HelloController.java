package com.feifz.eurekaconsumerfeign.control;

import com.feifz.eurekaconsumerfeign.service.SchedualServiceHi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/4 10:30
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
