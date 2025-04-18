package com.bridgelab.logger;


import com.bridgelab.logger.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class LoggerApplication {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(LoggerApplication.class);

    public static void main(String[] args) {
        logger.debug("\nWelcome to Spring Concept Demo");

        ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);

        logger.debug("\nChecking Context: {}", context.getBean(DemoBean.class));

        logger.debug("\n*** Example Using @Autowired annotation on property ***");
    }


}
