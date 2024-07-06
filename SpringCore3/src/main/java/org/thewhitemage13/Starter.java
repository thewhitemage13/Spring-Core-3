package org.thewhitemage13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Starter {
    private GreeterService greeterService;

    // Если у нас только один конструктор, то не нужно указывть Autowired
    // Spring автоматически понимает
    public Starter(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

//    @Autowired
//    public void setGreeterService(GreeterService greeterService) {
//        this.greeterService = greeterService;
//    }

    public void greet() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String greeting = greeterService
                .getGreeter()
                .greeting(name);
        System.out.println(greeting);
    }
}
