package algorithmDijkstra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileReader {

    List<String> readFromFile() {
        List<String> data = new ArrayList<>();
        try {
            String path = "C:\\Users\\Goldz\\IdeaProjects\\AlgorithmDijkstra\\src\\Cities\\cities";
            data = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
