package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@MapperScan( "com.mmzs.springboot.s00.application")
public class StaticScheduleTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(StaticScheduleTaskApplication.class, args);
    }
}