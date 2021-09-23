package tarleton.lab6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            Answer a = new Answer(questions.get(0).getId(),ans);
            try (PrintWriter out = new PrintWriter( new OutputStreamWriter(
                new FileOutputStream("output.txt", true),"UTF-8"))) {
            out.printf(a.toString());
            };
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
