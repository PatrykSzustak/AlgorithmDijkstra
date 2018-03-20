package zadanie5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Zadanie5 {


        public static void main(String[] args) {

            List<Integer> listaInt = Arrays.asList(1, 2, 3, 5, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15);

            System.out.println(Zadanie5.check(listaInt));

        }


        public static boolean check(List<Integer> list){
            return (new HashSet<Integer>(list).size()== list.size());
        }
    }
