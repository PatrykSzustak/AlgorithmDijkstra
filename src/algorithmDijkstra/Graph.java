package algorithmDijkstra;

import java.util.List;

class Graph {
    private final List<Vertex> vertices;

    Graph(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    List<Vertex> getVertices() {
        return vertices;
    }
}
