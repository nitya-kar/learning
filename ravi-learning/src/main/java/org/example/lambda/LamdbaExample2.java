package org.example.lambda;

import java.util.concurrent.Callable;

public class LamdbaExample2 {

    public static void main(String[] args) throws InterruptedException {

         // Write Functional interface and implement in traditional way
        // Implement callable interface and write traditional code as well as lamda code

        Thread t = new Thread(() ->
                System.out.println("ravi")
        );

        t.start();





        Thread.sleep(10000);

    }
}
