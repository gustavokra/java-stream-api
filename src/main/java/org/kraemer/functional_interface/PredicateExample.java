package org.kraemer.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        List<String> palavrasMaisCincoChar = palavras.stream()
                .filter(maisDeCincoCaracteres)
                .toList();

        palavrasMaisCincoChar.forEach(System.out::println);

//        List<String> palavrasMaisCincoChar = palavras.stream().filter(
//                new Predicate<String>() {
//                    @Override
//                    public boolean test(String palavra) {
//                        return palavra.length() > 5;
//                    }
//                }
//        ).toList();

    }

}
