package com.feifz.eurekaprivoder.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/3 14:38
 */
@RestController
public class ProviderHelloCotroller {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "Micheal Jordan") String name) {
        return "hello " + name + " ,i'm from port:" + port;
    }
}
