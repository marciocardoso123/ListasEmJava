package aplication;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Program {
    public static void main(String[] args) {
     //instanciando a interface lista
        List<String> list = new ArrayList<>();
        //adicionar elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        //remover elementos
        System.out.println("---------------------");
        //reova elemento q começa com a letra m
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        //consultar elementos
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}