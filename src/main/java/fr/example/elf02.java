package fr.example;

import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class elf02 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        HashMap<Integer, String> elfs = new HashMap<>();
        elfs.put(1, "A");
        elfs.put(2, "B");
        elfs.put(3, "C");
        HashMap<Integer, String> me = new HashMap<>();
        me.put(1, "Y");
        me.put(2, "X");
        me.put(3, "Z");

        Path path = Paths.get(elf01.class.getClassLoader()
                .getResource("annexe2.txt").toURI());

        Stream<String> lines = Files.lines(path);
        var data = lines.collect(Collectors.toList());
        lines.close();
        int score = 0;
        for (String line : data) {
            if (line.equals("A Y")) {
                score += 2 + 6;
            }
            if (line.equals("A X")) {
                score += 1 + 3;
            }
            if (line.equals("A Z")) {
                score += 3 + 0;
            }

            if (line.equals("B Y")) {
                score += 2 + 3;
            }
            if (line.equals("B X")) {
                score += 1 + 0;
            }
            if (line.equals("B Z")) {
                score += 3 + 6;
            }
            // A X rock
            // B Y paper
            // C Z scissor
            if (line.equals("C Y")) {
                score += 2 + 0;
            }
            if (line.equals("C X")) {
                score += 1 + 6;
            }
            if (line.equals("C Z")) {
                score += 3 + 3;
            }

        }
        System.out.println(score);
        Assertions.assertEquals(data, data);
    }

}


