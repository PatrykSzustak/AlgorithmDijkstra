package zadanie3;

import zadanie2.Zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println(Zadanie3.zadanie3(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15),5));
    }


    public static ArrayList zadanie3(List<Integer> lista, int x){
        ArrayList list = new ArrayList();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i)<=x){
                list.add(lista.get(i));

            }
        }
        return list;

    }
}
