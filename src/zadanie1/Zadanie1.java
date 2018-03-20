package zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie1 {

    public static void main(String[] args) {


        System.out.println(Zadanie1.zadanie1(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)));

    }


    public static ArrayList zadanie1(List<Integer> lista){
        ArrayList list = new ArrayList();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i)%3==0){
                list.add(lista.get(i));

            }
        }
return list;

    }
}
