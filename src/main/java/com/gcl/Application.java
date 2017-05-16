package com.gcl;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @ClassName: Application 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月15日 下午5:47:22
 */
@Controller
@EnableWebMvc           //开启springmvc支持
@SpringBootApplication
@MapperScan("com.gcl.web.dao") //自动扫描
public class Application extends WebMvcAutoConfigurationAdapter {
    
    private static final Logger logger = Logger.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
        
    }

    /*@RequestMapping("/")
    String home() {
        return "redirect:countries";
    }*/
}
