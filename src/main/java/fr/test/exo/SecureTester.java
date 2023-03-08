package fr.test.exo;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SecureTester {
    private static Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
    public static boolean alphanumeric(String s){
        return Stream.of(s)
                .filter(StringUtils::isEmpty)
                .map(x->false).findAny()
                .orElseGet(()->p.matcher(s).find());
    }
}
