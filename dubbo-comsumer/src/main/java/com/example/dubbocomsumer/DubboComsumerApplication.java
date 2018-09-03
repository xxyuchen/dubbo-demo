package com.example.dubbocomsumer;

import com.example.provider.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ImportResource({"classpath:dubbo-comsumer.xml"})
public class DubboComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerApplication.class, args);
    }

    @RequestMapping("/cum/demo")
    public String hello(){
        return "hello man";
    }

    @Autowired
    private ComputeService computeService;

    @RequestMapping("/cum/add")
    public Integer add(Integer a,Integer b){
        Integer add = computeService.add(a, b);
        return add;
    }
}
