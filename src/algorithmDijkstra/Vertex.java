package algorithmDijkstra;

import java.util.ArrayList;
import java.util.List;

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

        public String getName() {
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
}
