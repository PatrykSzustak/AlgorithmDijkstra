package mojAlgorytmDijkstra;

public class Main {
    public static void main(String[] args) {

        Vertex wroclaw = new Vertex("Wrocław");
        Vertex lodz = new Vertex("Lódź");
        Vertex warszawa = new Vertex("Warszawa");

       wroclaw.link(lodz,216);
       lodz.link(warszawa,140);

        System.out.println(wroclaw.getEdges().get(0).other(wroclaw));
        System.out.println(lodz.getEdges().get(1).other(lodz));


    }
}
