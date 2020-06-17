package streamapi1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamApi1 {

	public static void main(String[] args) {
		List<String> lists=Arrays.asList("sagar","bhargav","ravi");
		//foreachMethod
		lists.forEach(a->System.out.println(a));
		System.out.println("-----------------------------------------");
		
	//	for filter() class use is Predicate<>()
		lists.stream()
			 .filter(new Predicate<String>() {

				@Override
				public boolean test(String name) {
				
					return !name.equals("sagar");
				}
			})
			 //for foreach()  class used Consumer
			 .forEach(new Consumer<String>() {

				@Override
				public void accept(String name) {
					System.out.println(name);
					
				}
			});
		
		System.out.println("---------------------------------");
		// instead of writting dis we can write in lambda
		
		lists.stream()
			 .filter(StreamApi1::result)
			 .forEach(System.out::println);
		System.out.println("---------------------------------");
		
		
		//lambda
		lists.stream().filter(name->name.equals("sagar")).forEach(name->System.out.println(name));
	
	}
	private static boolean result(String a) {
		return !a.equals("sagar");
	}

}
