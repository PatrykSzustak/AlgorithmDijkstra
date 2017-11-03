package algorithmDijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vertex wroclaw = new Vertex("Wroclaw");
        Vertex lodz = new Vertex("Lodz");
        Vertex warszawa = new Vertex("Warszawa");


        wroclaw.link(lodz,216);
        lodz.link(warszawa,300);



        Vertex aktualny = wroclaw.getEdges().get(0).other(wroclaw);
        System.out.println(aktualny);
        System.out.println(aktualny.getEdges().get(1).other(lodz));
    /*    List<Vertex> cities = new ArrayList<>();
        cities.add(wroclaw);*/
        Graph graph1 = new Graph(Arrays.asList(wroclaw, lodz, warszawa));





    }
}
