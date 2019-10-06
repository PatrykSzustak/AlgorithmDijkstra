package algorithmDijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertex implements Comparable<Vertex> {
    private final List<Edge> edges = new ArrayList<>();
    private final String name;
    private float calculatedDistance;

    Vertex(String name) {
        this.name = name;
    }

    List<Edge> getEdges() {
        return edges;
    }

    String getName() {
        return name;
    }

    float getCalculatedDistance() {
        return calculatedDistance;
    }

    void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    void link(Vertex otherVertex, float value) {
        Edge edge = new Edge(this, otherVertex, value);
        edges.add(edge);
        otherVertex.getEdges().add(edge);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex v) {
        return Float.compare(calculatedDistance, v.getCalculatedDistance());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        if (Float.compare(vertex.calculatedDistance, calculatedDistance) != 0) return false;
        if (!edges.equals(vertex.edges)) return false;
        return Objects.equals(name, vertex.name);
    }

    @Override
    public int hashCode() {
        int result = edges.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (calculatedDistance != +0.0f ? Float.floatToIntBits(calculatedDistance) : 0);
        return result;
    }
}
