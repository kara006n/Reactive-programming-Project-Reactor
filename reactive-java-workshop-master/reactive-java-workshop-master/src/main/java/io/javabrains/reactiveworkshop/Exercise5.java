package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;


public class Exercise5 {

      public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumberFlux() and ReactiveSources.userFlux()

            // Subscribe to a flux using the error and completion hooks
//            ReactiveSources.intNumbersFlux().subscribe(
//                    number -> System.out.println(number),
//                    err -> System.out.println(err),
//                    () -> System.out.println("Complete")
//            );

            // Subscribe to a flux using an implementation of BaseSubscriber
            ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

            System.out.println("Press a key to end");
            System.in.read();
      }

}

class MySubscriber<T> extends BaseSubscriber<T> {

      @Override
      protected void hookOnSubscribe(Subscription subscription) {
            System.out.println("Subscribe happened");
            request(1);
      }

      @Override
      protected void hookOnNext(T value) {
            System.out.println(value.toString() + " received");
            request(1);

      }

      @Override
      protected void hookOnComplete() {
            System.out.println("Completed");
      }

      @Override
      protected void hookOnError(Throwable throwable) {
            super.hookOnError(throwable);
      }
}