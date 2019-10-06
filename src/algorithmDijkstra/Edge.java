package algorithmDijkstra;

public class Edge {
    private static final int amountOfVertex = 2;
    private Vertex[] vertices = new Vertex[amountOfVertex];
    private final float length;

    Edge(Vertex first, Vertex second, float length) {
        if (first == second) throw new IllegalArgumentException("Edge must link different vertices");
        this.length = length;
        this.vertices[0] = first;
        this.vertices[1] = second;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    float getLength() {
        return length;
    }

    Vertex otherVertex(Vertex otherVertex) {
        if (otherVertex == vertices[0]) return vertices[1];
        else if (otherVertex == vertices[1]) return vertices[0];
        else throw new IllegalArgumentException("Given vertex is not part of the edge");
    }

    @Override
    public String toString() {
        return "Edge " + length + " links " + vertices[0].getName() + " and " + vertices[1].getName();
    }
}
