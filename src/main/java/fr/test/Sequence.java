package fr.test;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.plexus.util.CollectionUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sequence {
    //IntStream.range(-n, 0).map(Math::abs).toArray();
    //IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    public static int[] reverse(int i) {
        int[] v = new int[i];
        for (int j = 0; i > 0; i--){
            v[j++]=i;
        }
        return v;
    }


    public static boolean isMerge(String s, String part1, String part2) {
        part1.replace("\\","/");
        part2.replace("\\","/");
        s.replace("\\","/");
        var merged = Arrays.asList(part1.trim(), part2.trim()).stream().collect(Collectors.joining()).toCharArray();
        var actual = s.toCharArray();
        Arrays.sort(actual);Arrays.sort(merged);
        System.out.println(String.copyValueOf(actual));System.out.println(String.copyValueOf(merged));
        var a= Arrays.compare(actual, merged);
        return Arrays.equals(actual,merged);
    }

}
