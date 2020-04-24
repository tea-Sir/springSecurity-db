package org.teasir.securitydb.securitydb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.teasir.securitydb.securitydb.mapper")
public class SecurityDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDbApplication.class, args);
    }

}
