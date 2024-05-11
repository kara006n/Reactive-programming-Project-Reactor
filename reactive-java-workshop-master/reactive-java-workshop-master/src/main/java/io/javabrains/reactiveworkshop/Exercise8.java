package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


      public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumbersFluxWithException()

            // Print values from intNumbersFluxWithException and print a message when error happens
//            ReactiveSources.intNumbersFluxWithException()
//                    .subscribe(item -> System.out.println(item),
//                            err -> System.out.println("Error occurred"),
//                            () -> System.out.println("Completed"));

            // Print values from intNumbersFluxWithException and continue on errors
//            ReactiveSources.intNumbersFluxWithException()
//                    .onErrorContinue((err1, item) -> System.out.println("Error!!!" + err1.getMessage() + " for item " + item))
//                    .subscribe(item -> System.out.println(item),
//                            err -> System.out.println("Error occurred"),
//                            () -> System.out.println("Completed"));

            // Print values from intNumbersFluxWithException and when errors
            // happen, replace with a fallback sequence of -1 and -2
            ReactiveSources.intNumbersFluxWithException()
                    .onErrorResume(err -> Flux.just(-1, -2))
                    .subscribe(item -> System.out.println(item));

            System.out.println("Press a key to end");
            System.in.read();
      }

}
