package prac14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340"); // Шаблон для поиска
        Matcher m1 = p.matcher( "abcdefghijklmnopqrstuv18340" );
        Matcher m2 = p.matcher( "something else" );
        System.out.println(m1.matches());
        System.out.println(m2.matches());
    }
}