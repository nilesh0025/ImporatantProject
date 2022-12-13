package spring_boot_restapi.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EntityScan(basePackages = "spring_boot_restapi")
@ComponentScan(basePackages = "spring_boot_restapi.Entity")
@EntityScan(basePackages = "spring_boot_restapi.Entity")
public class Spring_Configuration {

}
