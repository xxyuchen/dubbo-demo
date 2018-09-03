package com.example.provider.service.impl;

import com.example.provider.service.ComputeService;

/**
 * @author tangzhen
 * @create 2018/9/3 下午5:46
 * @desc
 **/
public class ComputeServiceImpl implements ComputeService {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
