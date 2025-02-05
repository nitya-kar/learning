package org.example.lambda;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *   Test a condition  -> whatever condition you passs to predicate -> true or false
 *
 *   Built in Functional Interface
 *
 *   if we implement the abstract method of an FI, then we call it as implemention of FI
 *   and we can store the method implentation under the FI object
 *
 */
public class PredicateLeaning {

    public static void main(String[] args) {

        Predicate<String> testName1 = (name) -> name.equalsIgnoreCase("ravi");
        Predicate<String> testName2 = (name) -> name.equalsIgnoreCase("nitya");



        /**
         *
         *   default Predicate<T> and(Predicate<? super T> other) {
         *         Objects.requireNonNull(other);
         *         return (t) -> test(t) && other.test(t);
         *     }
         *
         */



        Predicate<String>  predicate = testName1.and(testName2);

        boolean result = predicate.test("ravi");

        System.out.println("result = " + result);


        /**
         * 
         *     default Predicate<T> negate() {
         *         return (t) -> !test(t);
         *     }
         */

        Predicate<String> negate = testName1.negate();

        boolean nitya = negate.test("Nitya");

        System.out.println("nitya = " + nitya);


        Function<String, String> getMeLength = (inputString) -> inputString.toUpperCase();
        String modifiedName = getMeLength.apply("Nityanand kar");
        System.out.println(modifiedName);



    }

  @FunctionalInterface
  interface  abc {
        void print();
    }
}
