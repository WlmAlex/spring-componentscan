package guru.springframework.blog.componentscan.example;

import guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageB.DemoBeanB1;
import guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageB.DemoBeanB2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackageClasses = {DemoBeanB2.class},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                value = DemoBeanB2.class))
public class BlogPostsApplicationExcludeFilter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.
                run(BlogPostsApplicationExcludeFilter.class, args);
        System.out.println("Contains B1  " + context.containsBean("demoBeanB1"));
        System.out.println("Contains B2  " + context.containsBean("demoBeanB2"));
        System.out.println("Contains B3  " + context.containsBean("demoBeanB3"));
    }
}