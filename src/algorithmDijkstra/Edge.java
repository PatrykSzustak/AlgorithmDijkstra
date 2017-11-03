package algorithmDijkstra;

public class Edge {

    private Vertex[] vertices = new Vertex[2];
    private final float length;


    public Edge(Vertex first, Vertex second, float length) {
        if(first == second){
            throw new IllegalArgumentException("Edge must link different vertices");
        }
        this.length = length;
        this.vertices[0] = first;
        this.vertices[1]= second;
    }


    public Vertex other(Vertex oneVertex){
        if(oneVertex == vertices[0] ){
        return vertices[1];
        }else if(oneVertex == vertices[1]){
            return vertices[0];
        } else {
            throw  new IllegalArgumentException("Złe miasto");
        }
    }



    public Vertex[] getVertices() {
        return vertices;
    }

    public float getLength() {
        return length;
    }
}
