# Stream API
Resumos, estudos e práticas dos métodos Stream em conjunto com *Functional Interfaces*, *Lambda*, *Method Reference* e *Optional*.

## O que é a Stream API?
Opção para manipulação de coleções em Java que segue os princípios da programação funcional.
Stream trata-se de uma solução para processar coleções de maneira declarativa.

As operações na Stream API podem ser classificadas em duas categorias principais:
- Operações intermadiárias, que retornam uma nova Stream, permitindo criar um pipeline de processamento de dados.
- Operações terminais: são aquelas que encerram o pipeline e produzim um resultado final.

## O que é Lambda?
Uma função lambda é uma função sem declaração. 
Sintaxe :
```
(argumento) -> (corpo)
```

Permitem representar interfaces funcionais (SAM, Syngle Abstract Method, interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.

## O que é Method Reference?
Method Reference permite fazer referência a um método ou construtor de uma classe de forma funcional.
Para utilizado, basta informar uma classe ou referência seguida do símbolo "::"
```
 pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
```

## Functional Interfaces
### Supplier<T>
Representa uma operação que não aceita um argumento e retorna um resultado do tipo T.

```
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
```
### Consumer<T>
Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
É usado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor.

```
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);  
  
        Consumer<Integer> imprimirNumeroPar = numero -> {  
            if (numero % 2 == 0) {  
                System.out.println(numero);  
            }  
        };  
  
        numeros.forEach(numero -> {  
                    if (numero % 2 == 0) {  
                        System.out.println(numero);  
                    }  
                }  
        );  
  
//        numeros.forEach(  
//                new Consumer<Integer>() {  
//                    @Override  
//                    public void accept(Integer numero) {  
//                        System.out.println(numero);  
//                    }  
//                }  
//        );
```

### Function <T, R>
Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.

```
 List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);  
  
        Function<Integer, String> dobrar = numero -> {  
            Integer dobro = numero * 2;  
            return dobro.toString();  
        };  
  
        List<String> numerosDobradosString = numeros.stream()  
                .map(numero -> {  
                    int dobro = numero * 2;  
                    return Integer.toString(dobro);  
                })  
                .toList();  
  
        numerosDobradosString.forEach(System.out::println);  
  
//        List<String> numerosDobradosString = numeros.stream()  
//                .map(  
//                    new Function<Integer, String>() {  
//                        public String apply(Integer numero) {  
//                            int dobro = numero * 2;  
//                            return Integer.toString(dobro);  
//                        }  
//                    }  
//                )  
//                .toList();
```

### Predicate<T>
Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.

```
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
```

### BinaryOperator<T>
Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

```
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
```



