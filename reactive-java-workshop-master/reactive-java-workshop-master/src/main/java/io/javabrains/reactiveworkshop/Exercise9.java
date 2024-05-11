package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


      public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumbersFlux()

            // Print size of intNumbersFlux after the last item returns
            //ReactiveSources.intNumbersFlux().count().subscribe(System.out::println);//hover the mouse over count() it will say it is returning Mono of Integer so it means we convert flux
            //of integers into mono of integer

            // Collect all items of intNumbersFlux into a single list and print it
            //ReactiveSources.intNumbersFlux().collectList().subscribe(System.out::println);

            // Transform to a sequence of sums of adjacent two numbers
//            ReactiveSources.intNumbersFlux().buffer(2).map(x -> x.get(0) + x.get(1)).subscribe(System.out::println);
            ReactiveSources.intNumbersFlux().buffer(2).map(x -> x.stream().mapToInt(Integer::intValue).sum()).subscribe(System.out::println);

            System.out.println("Press a key to end");
            System.in.read();
      }

}
