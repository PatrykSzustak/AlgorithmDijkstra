package algorithmDijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> data = fileReader.readFromFile();
        List<Vertex> citiesList = new ArrayList<>();

        data.forEach(s -> {
            String[] line = s.split(",");
            Optional<Vertex> first = citiesList.stream().filter(v -> v.getName().equals(line[0])).findFirst();
            Vertex v1;
            if (first.isPresent()) {
                v1 = first.get();
            } else {
                v1 = new Vertex(line[0]);
            }
            Optional<Vertex> second = citiesList.stream().filter(v -> v.getName().equals(line[1])).findFirst();
            Vertex v2;
            if (second.isPresent()) {
                v2 = second.get();
            } else {
                v2 = new Vertex(line[1]);
            }
            v1.link(v2, Float.parseFloat(line[2]));
            if (!citiesList.contains(v1)) {
                citiesList.add(v1);
            }
            if (!citiesList.contains(v2)) {
                citiesList.add(v2);
            }
        });
        Graph cities = new Graph(citiesList);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        System.out.println(dijkstra.calculate(cities, citiesList.get(1), citiesList.get(3)));
    }
}
