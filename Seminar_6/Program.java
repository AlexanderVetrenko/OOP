package Seminar_6;

import java.time.LocalDate;
import java.time.Month;

public class Program {
    public static void main(String[] args) {
        Person natasha = new Person("Наталья", LocalDate.of(1969, Month.AUGUST, 5), Gender.FEMALE);
        Person alex = new Person("Алексей", LocalDate.of(1965, Month.DECEMBER, 25), Gender.MALE);
        Person mary = new Person("Мария", LocalDate.of(1988, Month.APRIL, 5), Gender.FEMALE);
        Person maxim = new Person("Максим", LocalDate.of(1987, Month.JANUARY, 5), Gender.MALE);
        Person child = new Person("Борис", LocalDate.of(2018, Month.JULY, 5),Gender.MALE);
        Parents parBoris = new Parents(maxim,mary);
        Parents parMary = new Parents(alex, null);
        Parents parMaxim = new Parents(null, null);
        
        child.setPapamama(parBoris);
        mary.setPapamama(parMary);
        maxim.setPapamama(parMaxim);
        System.out.println(child.getGrandParents());
 
    }
}
