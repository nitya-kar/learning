package org.example.lambda;

@FunctionalInterface
interface Greet{
    void greetMsg(String name);
}

public class LambdaExample {

    public static void main(String[] args) {

        Greet greeting = (name) -> {
            System.out.println("Hello " + name);
        };

        greeting.greetMsg("Ravi");

    }
}
