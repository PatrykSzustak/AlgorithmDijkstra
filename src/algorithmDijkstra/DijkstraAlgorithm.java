package algorithmDijkstra;


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class DijkstraAlgorithm {


    public float calculateDistance(Vertex origin, Vertex destination, Graph graph) {
        Set<Vertex> set = new HashSet<>(graph.getGraph());

        for (Vertex vertex : set){
            if(vertex != origin){
                vertex.setCalculatedDistance(Float.MAX_VALUE);
            } else {
                vertex.setCalculatedDistance(0);
            }
        }

       /* set.stream().forEach(v ->v.setCalculatedDistance(Float.MAX_VALUE));
        origin.setCalculatedDistance(0);*/

        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>(graph.getGraph());

        while(!priorityQueue.isEmpty()){
            priorityQueue.remove();

        }





       return 0;
    }

}
