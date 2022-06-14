package ch.demo.configuration;

import ch.demo.ports.api.EmployeeServicePort;
import ch.demo.ports.spi.EmployeePeristencePort;
import ch.demo.service.EmployeeJpaAdapter;
import ch.demo.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConf {

    @Bean
    public EmployeePeristencePort employeePeristencePort(){
        return new EmployeeJpaAdapter();
    }

    @Bean
    public EmployeeServicePort employeeServicePort(){
        return new EmployeeServiceImpl(employeePeristencePort());
    }
}
