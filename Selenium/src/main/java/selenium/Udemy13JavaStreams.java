package selenium;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Udemy13JavaStreams {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mihai");
        names.add("Marinica");
        names.add("Cami");
        names.add("Aris");
        int count = 0;
        for(int i=0;i<names.size();i++){
            String name2= names.get(i);
            if(name2.startsWith("M")){
                count++;
            }
        }
        System.out.println(count);

        //VARIANTA CU STREAM
        long a = names.stream().filter(s->s.startsWith("M")).count();
        System.out.println(a);

//       DACA AI MAU MULTE CONDITII LE POTI SCRIE ASA
        long d = Stream.of("Mihai","Marinica","Cami","Aris").filter(s->{
            s.startsWith("M");
            return true;
        }).count();
        System.out.println(d);

//  PRINT ALL NAMES OF ARRAYLIST
        names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s)); // afiseaza toate numele mai mari ca 4 litere
        names.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s)); //afiseaza primul nume cu mai mult de 4 litere

        //STREAM MAP
        //print name wich have last letter "i" in Uppercase
        Stream.of("Mihai","Marinica","Cami","Aris").filter(s -> s.endsWith("i")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        //print names wich have first letter as "M" with uppercase and sorted
        Stream.of("Mihai","Marinica","Cami","Aris").filter(s -> s.startsWith("M")).map(s->s.toUpperCase()).sorted().forEach(s -> System.out.println(s));

        //MERGING 2 ARRAYS LIST
        ArrayList<String> names1 = new ArrayList<>();
        names.add("Maria");
        names.add("Catalina");
        names.add("Catalin");
        names.add("Alex");

        Stream<String> concatStream = Stream.concat(names.stream(),names1.stream());
        concatStream.sorted().forEach(s -> System.out.println(s));
//        boolean flag = concatStream.anyMatch(s -> s.equalsIgnoreCase("Mihai"));
//        System.out.println(flag);
//        Assert.assertTrue(flag);

        //STREAM COLLECT
        List<String> lista = Stream.of("Mihai","Marinica","Cami","Aris").filter(s -> s.endsWith("i")).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(lista.get(0));

        List<Integer> numere = Arrays.asList(2,3,4,5,63,4,2,5);
        //PRINT UNIQUE NUMBER FROM THE ARRAY
        //SORT THE ARRAY - and then give me the 3 th index
        numere.stream().distinct().forEach(s-> System.out.println(s));
        List<Integer> li = numere.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));
    }
}
