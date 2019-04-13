package service.orgnization.sw.zuul.configs;

import service.orgnization.sw.zuul.filters.ErrorFilter;
import service.orgnization.sw.zuul.filters.PostFilter;
import service.orgnization.sw.zuul.filters.PreFilter;
import service.orgnization.sw.zuul.filters.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
