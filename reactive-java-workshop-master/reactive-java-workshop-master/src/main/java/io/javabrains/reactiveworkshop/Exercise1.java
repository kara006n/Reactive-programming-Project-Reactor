package io.javabrains.reactiveworkshop;

public class Exercise1 {

      public static void main(String[] args) {

            // Use StreamSources.intNumbersStream() and StreamSources.userStream()

            // Print all numbers in the intNumbersStream stream
            StreamSources.intNumbersStream().forEach(x -> System.out.println(x));

            // Print numbers from intNumbersStream that are less than 5
            //StreamSources.intNumbersStream().filter(x -> x < 5).forEach(x -> System.out.println(x));

            // Print the second and third numbers in intNumbersStream that's greater than 5
            //StreamSources.intNumbersStream().skip(1).limit(2).forEach(x -> System.out.println(x));

            //  Print the first number in intNumbersStream that's greater than 5.
            //  If nothing is found, print -1
//            Integer integer = StreamSources.intNumbersStream().filter(x -> x > 5).findFirst().orElse(-1);
//            System.out.println(integer);

            // Print first names of all users in userStream
            //StreamSources.userStream().forEach(x -> System.out.println(x.getFirstName()));
            //StreamSources.userStream().map(x -> x.getFirstName()).forEach(x -> System.out.println(x));

            // Print first names in userStream for users that have IDs from number stream
            //StreamSources.intNumbersStream().flatMap(x -> StreamSources.userStream().filter(user -> user.getId() == x)).forEach(x -> System.out.println(x.getFirstName()));
            //StreamSources.userStream().filter(user -> StreamSources.intNumbersStream().anyMatch(i -> i == user.getId())).forEach(x -> System.out.println(x.getFirstName()));


      }

}
