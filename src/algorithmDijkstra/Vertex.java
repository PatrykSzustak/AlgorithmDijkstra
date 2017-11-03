package algorithmDijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {


    private final String cityName;
    private final List<Edge> edges = new ArrayList<>();
    private float calculatedDistance;

    public Vertex(String cityName) {
        this.cityName = cityName;
    }

public void link (Vertex other, float value){
        Edge edge = new Edge(this,other,value);
        edges.add(edge);
        other.edges.add(edge);
}

    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    public float getCalculatedDistance() {
        return calculatedDistance;
    }

    public void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    @Override
    public int compareTo(Vertex o) {
        return Float.compare(calculatedDistance, o.calculatedDistance);
    }

}
