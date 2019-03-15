package com.baomidou.mybatisplus.samples.quickstart;

import static org.assertj.core.api.Assertions.useRepresentation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.samples.quickstart.entity.User;


@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class QuickstartApplication {
		
    public static void main(String[] args) {
        SpringApplication.run(QuickstartApplication.class, args);
    }

}
