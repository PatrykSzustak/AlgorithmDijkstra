package algorithmDijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Vertex wroclaw = new Vertex("Wroclaw");
        Vertex lodz = new Vertex("Lodz");
        Vertex warszawa = new Vertex("Warszawa");


        wroclaw.link(lodz,216);
        lodz.link(warszawa,300);



        Vertex aktualny = wroclaw.getEdges().get(0).other(wroclaw);
        System.out.println(aktualny);
        System.out.println(aktualny.getEdges().get(1).other(lodz));
    *//*    List<Vertex> cities = new ArrayList<>();
        cities.add(wroclaw);*//*
        Graph graph1 = new Graph(Arrays.asList(wroclaw, lodz, warszawa));*/


        Vertex wroclaw = new Vertex("Wroclaw");
        Vertex katowice = new Vertex("Katowice");
        Vertex lodz = new Vertex("Lodz");
        Vertex warszawa = new Vertex("Warszawa");
        Vertex poznan = new Vertex("Poznan");
        Vertex krakow = new Vertex("Krakow");
        Vertex gdansk = new Vertex("Gdansk");
        Vertex gdynia = new Vertex("Gdynia");
        Vertex newYork = new Vertex("New York");
        Vertex boston = new Vertex("Boston");

        wroclaw.link(lodz, 216.8f);
        wroclaw.link(poznan, 184.4f);
        wroclaw.link(katowice, 194.5f);
        krakow.link(katowice, 80.36f);
        krakow.link(warszawa, 294.8f);
        krakow.link(lodz, 266.8f);
        lodz.link(warszawa, 139.1f);
        poznan.link(lodz, 217.8f);
        poznan.link(gdansk, 337.9f);
        lodz.link(gdansk, 336.9f);
        warszawa.link(gdansk, 417.4f);
        gdynia.link(gdansk, 22.4f);
        boston.link(newYork, 345.6f);




    }
}
