package com.feifz.eurekaconsumerfeign.service.impl;

import com.feifz.eurekaconsumerfeign.service.SchedualServiceHi;

import org.springframework.stereotype.Component;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/9/4 11:17
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
