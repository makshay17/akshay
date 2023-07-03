package main.java.june28;

import java.util.Optional;

public class Option {
    public static int len(String str){
        return str.length();
    }
    public static void main(String[] args)
    {
        String str1 = null;
        Optional<String> empty
                = Optional.ofNullable(str1);
        if (empty.isPresent()) {
            System.out.println(len(str1));
        }
        else
            System.out.println(Optional.empty());
    }

}