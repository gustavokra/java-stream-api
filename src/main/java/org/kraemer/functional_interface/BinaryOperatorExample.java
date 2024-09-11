package org.kraemer.functional_interface;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<BigDecimal> numeros = Arrays.asList(BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3));

//        BinaryOperator<BigDecimal> somarNumeros = (a, b) -> a.divide(b, 2);

        BinaryOperator<BigDecimal> somarNumeros = BigDecimal::multiply;
        BigDecimal soma = numeros.stream().reduce(somarNumeros).get();

//        BigDecimal soma = numeros.stream().reduce(
//                new BinaryOperator<BigDecimal>() {
//                    @Override
//                    public BigDecimal apply(BigDecimal a, BigDecimal b) {
//                        return a.multiply(b);
//                    }
//                }
//        ).get();

        System.out.println(soma);
    }

}
