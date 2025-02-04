package org.example.lambda;

interface Greeting{
    void greet();
    void greet(String name);
}
public class NormalInterfaceImplemtation {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {

            }

            @Override
            public void greet(String name) {

            }
        };

    }
}
