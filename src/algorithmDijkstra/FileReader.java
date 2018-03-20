package algorithmDijkstra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private String path = "/media/patryk/Cities/cities";

    public List<String> readFromFile() {

        List<String> data = new ArrayList<>();

        try {
            data = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
