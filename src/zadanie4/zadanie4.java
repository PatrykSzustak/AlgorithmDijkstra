package zadanie4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class zadanie4 {
    public static void main(String[] args) {
//        System.out.println(zadanie4.zadanie4(Arrays.asList("patryk", "Tomek", "Kuba", "michal", "kamil", "jacek", "Ola", "Krzysiek")));

        List<String> listStrings = Arrays.asList("patryk", "Tomek", "kUba", "micHal", "kamil", "jacek", "olA", "Krzysiek");

        System.out.println(zadanie4.removeIfContainsUpperLetters(listStrings));


    }

    public static List<String> removeIfContainsUpperLetters(List<String> list){
        return list.stream().filter(s->s.toLowerCase().equals(s)).collect(Collectors.toList());
    }


    /*public static ArrayList zadanie4(List<String> lista){
        ArrayList listaCharow = new ArrayList();
        for (int i = 0; i <lista.size() ; i++) {
            for (int j = 0; j <lista.get(i).length(); j++) {

            }
        }

    }*/


}
