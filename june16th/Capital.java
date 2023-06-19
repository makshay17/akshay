package june16th;
import java.util.*;
import java.util.stream.*;

public class Capital {

    public static void main(String[] args) {
        String vowel1="aeiou";
        List<String> l=new ArrayList<>();
        l.add("pk");
        l.add("akshay");
        l.add("kiran");
        l.add("pavan");
        l.add("nagesh");
        l.add("latheesh");
        List<Integer> first=new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        int[] iarri  = {0};
        //Question 1
        List<String> ll=l.stream().map(second->{
            return Character.toUpperCase(second.charAt(0))+second.substring(1);
        }).sorted().collect(Collectors.toList());
        System.out.println("First Letter Captalized: "+ll);
        System.out.println();
        //Question 2
        l.stream().filter(s->s.toLowerCase().matches(".*[aeiou].*")).collect(Collectors.toList()).stream().forEach(s->{int cc=(int) s.toLowerCase().chars()
                .filter(c ->
                        ((char) c=='a'||(char) c=='e'||(char) c=='i'||(char) c=='o'||(char) c=='u')
                ).count();
            System.out.println("There are "+cc+" vowels in string "+s);});
        System.out.println();


        //Question 3
        double a=first.stream().map(si->{return (si%2==0)?si*si:0;}).mapToInt(aa -> aa).average().orElse(0);
        System.out.println(a);
        System.out.println();
        //Question 4
        Collections.sort(l,(String s1, String s2)->(s1.length()>s2.length())?1:(s1.length()==s2.length())?(s1.charAt(s1.length()-1))<(s2.charAt(s2.length()-1))?1:-1:-1);
        System.out.println(l);
        System.out.println();
    }
}
