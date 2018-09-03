package com.feifz.eurekaconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/3 15:10
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-PROVIDER/hello?name="+name,String.class);
    }

}
