package com.proggersofluck.stankinviewservice.config;

import com.proggersofluck.stankinviewservice.builder.NavigationMapBuilder;
import com.proggersofluck.stankinviewservice.builder.PathBuilder;
import com.proggersofluck.stankinviewservice.data.repo.NavigationPointRepository;
import com.proggersofluck.stankinviewservice.data.service.classes.NavigationPointServiceImpl;
import com.proggersofluck.stankinviewservice.data.service.interfaces.NavigationPointService;
import com.proggersofluck.stankinviewservice.process.RequestProcessor;
import com.proggersofluck.stankinviewservice.process.navigate.Navigator;
import com.proggersofluck.stankinviewservice.provider.NavigationProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {NavigationPointRepository.class})
public class AppBeansConfig {

    @Bean
    public NavigationPointService navigationPointService(NavigationPointRepository repository) {
        return new NavigationPointServiceImpl(repository);
    }

    @Bean
    public RequestProcessor requestProcessor(PathBuilder pathBuilder) {
        return new RequestProcessor(pathBuilder);
    }

    @Bean
    public PathBuilder pathBuilder(NavigationMapBuilder navigationMapBuilder,
                                   Navigator navigator) {
        return new PathBuilder(navigationMapBuilder,
                navigator);
    }

    @Bean
    public NavigationProvider navigationProvider(NavigationPointService service) {
        return new NavigationProvider(service);
    }

    @Bean
    public NavigationMapBuilder navigationMapBuilder() {
        return new NavigationMapBuilder();
    }

    @Bean
    public Navigator navigator() {
        return new Navigator();
    }
}
