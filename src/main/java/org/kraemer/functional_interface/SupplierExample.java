package org.kraemer.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo!")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);

//        List<String> listaSaudacoes = Stream.generate(
//                        new Supplier<String>() {
//                            @Override
//                            public String get() {
//                                return "Olá, seja bem-vindo!";
//                            }
//                        }
//                ).limit(5)
//                .toList();
    }


}
