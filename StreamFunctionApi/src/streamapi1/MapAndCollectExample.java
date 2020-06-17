package streamapi1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAndCollectExample {
	public static void main(String[] args) {
		List<String> nameList=Arrays.asList("sagar","ram");
		User user=new User();
		user.setAge(10);
		user.setName("Sagar");
		
		User user1=new User();
		user1.setAge(20);
		user1.setName("Bhargav");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user);
		List<String> nameLeft=new ArrayList<String>();
		userList.stream().filter(a-> a.getAge()<=30).map(User::getName)
	    .collect(Collectors.toList());
		;
		
		
//	List<User> a=nameList.stream().filter(name->!(name.length()>4))
//			 .map(s->) .collect(Collectors.toList());
		
	}

}
