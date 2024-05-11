package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

      public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumbersFlux()

            // Get all numbers in the ReactiveSources.intNumbersFlux stream
            // into a List and print the list and its size
            List<Integer> integers = ReactiveSources.intNumbersFlux().toStream().toList();
            System.out.println("List is " + integers);

            System.out.println("Size of List is " + integers.size());


            //now you can remove this below code because unlike previous exercise here we are already performing blocking
            //operation i.e. saving all elements of flux into stream i.e. waiting for it to get all elements and then convert it to list.
            //at last that integers variable of type List<Integer> will be initialized by that created list. so because of this blocking
            //until that list is created we will not move to instruction at line 15.
            System.out.println("Press a key to end");
            System.in.read();
      }

}
