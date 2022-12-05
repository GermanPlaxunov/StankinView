package com.proggersofluck.stankinviewservice.config;

import com.proggersofluck.stankinviewservice.builder.PathBuilder;
import com.proggersofluck.stankinviewservice.data.repo.StairRepository;
import com.proggersofluck.stankinviewservice.data.service.classes.StairServiceImpl;
import com.proggersofluck.stankinviewservice.data.service.interfaces.StairService;
import com.proggersofluck.stankinviewservice.process.RequestProcessor;
import com.proggersofluck.stankinviewservice.provider.StairProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {StairRepository.class})
public class AppBeansConfig {

    @Bean
    public StairService stairService(StairRepository repository){
        return new StairServiceImpl(repository);
    }

    @Bean
    public RequestProcessor requestProcessor(PathBuilder pathBuilder){
        return new RequestProcessor(pathBuilder);
    }

    @Bean
    public PathBuilder pathBuilder(StairProvider stairProvider){
        return new PathBuilder(stairProvider);
    }

    @Bean
    public StairProvider stairProvider(StairService service){
        return new StairProvider(service);
    }
}
