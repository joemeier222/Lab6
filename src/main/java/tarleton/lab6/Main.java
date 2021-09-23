package tarleton.lab6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joseph Meier
 */
public class Main {
    public static void main(String[] args) {
        try {
            Path pc = Paths.get("input.txt");
            Charset cs = Charset.forName("UTF-8");
            List<String> lines = Files.readAllLines(pc, cs);
            List<Question> questions = new ArrayList<>();
            for (String line : lines){
                String[] s = line.split("\\s+");
                Question q = new Question(Integer.parseInt(s[0]), s[1]);
                questions.add(q);
            }
            System.out.println(questions.get(0).toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
