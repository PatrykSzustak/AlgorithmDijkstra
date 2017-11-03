package algorithmDijkstra;

import java.util.List;

public class Graph {

private final List<Vertex> graph;

    public Graph(List<Vertex> graph){

        this.graph = graph;
    }

    public List<Vertex> getGraph() {
        return graph;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graph=" + graph +
                '}';
    }
}
