package org.thewhitemage13;

public class InformalGreeter implements Greeter{
    @Override
    public String greeting(String name) {
        return String.format("Hi, %s!", name);
    }
}
