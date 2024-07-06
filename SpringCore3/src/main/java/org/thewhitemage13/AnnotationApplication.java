package org.thewhitemage13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"org.thewhitemage13"})
public class AnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationApplication.class);

//        GreeterService service = context.getBean(GreeterService.class);
//
//        System.out.println("Enter your name: ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        String greeting = service.getGreeter().greeting(name);
//
//        System.out.println(greeting);

        Starter starter = context.getBean(Starter.class);
        starter.greet();
    }
}