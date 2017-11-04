package mojAlgorytmDijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    private List<Edge> edges = new ArrayList<>();
    private String cityName;
    private float calculatedDistance;

    public Vertex(String cityName) {
        this.cityName = cityName;
    }

    public void link(Vertex otherVertex, float value) {
        Edge edge = new Edge(this, otherVertex, value);
        edges.add(edge);
        otherVertex.edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getCalculatedDistance() {
        return calculatedDistance;
    }

    public void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vertex o) {
        return Float.compare(calculatedDistance, o.calculatedDistance);
    }
}
