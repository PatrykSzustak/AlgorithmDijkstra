package zadanie2;

import zadanie1.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println(Zadanie2.zadanie2(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15),5));
    }



    public static ArrayList zadanie2(List<Integer> lista, int n){
        ArrayList list = new ArrayList();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i)%n==0){
                list.add(lista.get(i));

            }
        }
        return list;

    }
}
