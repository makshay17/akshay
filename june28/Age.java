package main.java.june28;

import java.time.LocalDate;
import java.time.Period;

public class Age {

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1999,9,20);
        System.out.println(Period.between(dob,LocalDate.now()).getYears());
    }
}
