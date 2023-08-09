package Homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class SaveData {

    public void saveToFile(String filePath, Data data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, Charset.forName("UTF-8"), true)) {
            writer.write(data.toString());
            writer.write("\n");
            writer.flush();
        }
    }
}
