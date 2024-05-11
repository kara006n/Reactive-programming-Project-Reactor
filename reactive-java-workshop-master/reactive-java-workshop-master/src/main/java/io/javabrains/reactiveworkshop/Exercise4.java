package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

      public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumberMono()

            // Print the value from intNumberMono when it emits
            //ReactiveSources.intNumberMono().subscribe(x -> System.out.println(x));
            // Get the value from the Mono into an integer variable
            Integer block = ReactiveSources.intNumberMono().block();
            //Optional<Integer> block = ReactiveSources.intNumberMono().blockOptional();
            System.out.println(block);

            System.out.println("Press a key to end");
            System.in.read();
      }

}
