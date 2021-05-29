package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;


public class Streams {
public static void main (String args[]) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("vishal");
	a.add("vicky");
	a.add("karuna");
	a.add("bindhya");
	a.add("virat");
	
	Long count = a.stream().filter(s->s.startsWith("v")).count();
	System.out.println(count);
	
	a.stream().filter(s->s.startsWith("v")).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
List<String> ar = Arrays.asList("satish","sachin","shekar","dhoni","akhil");
List<String> name = ar.stream().sorted().collect(Collectors.toList());
System.out.println(name.get(2));
Stream<String> news = Stream.concat(a.stream(), ar.stream());
boolean flag = news.anyMatch(s->s.equalsIgnoreCase("dhoni"));
System.out.println(flag);
Assert.assertTrue(flag);

List<Integer> inte = Arrays.asList(3,5,5,6,3,7);
inte.stream().distinct().forEach(s->System.out.println(s));









}
}
