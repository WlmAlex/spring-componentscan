package guru.springframework.blog.componentscan.example;

import guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageB.DemoBeanB1;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageA",
        "guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageD",
        "guru.springframework.blog.componentscan.example.springcomponentscan.demoPackageE"},
        basePackageClasses = DemoBeanB1.class)
public class BlogPostsApplicationWithComponentScan {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BlogPostsApplicationWithComponentScan.class, args);
        System.out.println("Contains A  " + context.containsBeanDefinition("demoBeanA"));
        System.out.println("Contains B2  " + context.containsBeanDefinition("demoBeanB2"));
        System.out.println("Contains C   " + context.containsBeanDefinition("demoBeanC"));
    }

}
