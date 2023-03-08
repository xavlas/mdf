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

public class elf01 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path path = Paths.get(elf01.class.getClassLoader()
                .getResource("annexe.txt").toURI());

        Stream<String> lines = Files.lines(path);
        var data = lines.collect(Collectors.toList());
        lines.close();
        var i = 0;
        HashMap<Integer, Long> snacks = new HashMap();
        long a = 0L;
        for (String line : data) {

            if (line.equals("")) {

                snacks.put(i++, a);
                a = 0l;

                continue;
            } else {
                //System.out.println(a);
                a += Integer.valueOf(line);
            }

        }
        snacks.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        Assertions.assertEquals(data, data);
    }

}


