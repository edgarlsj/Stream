import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 5, 6, 9, 10); //iniciando uma lista com valores

        Stream<Integer> st1 = list.stream().map(x -> x * 10);//criando um stream a partir da lista

        System.out.println(Arrays.toString(st1.toArray()));//imprimindo o stream


        Stream<String> st2 = Stream.of("Maria", "Joao", "Alex"); //criando um stream a partir de valores

        Stream<String> filter = st2.map(x -> x.toUpperCase());//transformando os valores do stream em maiusculo

        System.out.println(Arrays.toString(filter.toArray()));//imprimindo o stream


    }
}