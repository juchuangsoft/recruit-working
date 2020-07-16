package net.auio.recruitworking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "net.auio.recruitworking.mapper")
public class RecruitWorkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecruitWorkingApplication.class, args);
    }

}
