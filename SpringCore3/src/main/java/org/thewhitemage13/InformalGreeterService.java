package org.thewhitemage13;

import org.springframework.stereotype.Service;

@Service
public class InformalGreeterService implements GreeterService {
    @Override
    public Greeter getGreeter() {
        return new InformalGreeter();
    }
}
