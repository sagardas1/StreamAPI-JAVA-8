package streamapi1;

import java.util.*;

public class MapAndCollectExample {
	public static void main(String[] args) {
		
		User user=new User();
		user.setAge(10);
		user.setName("Sagar");
		
		User user1=new User();
		user1.setAge(20);
		user1.setName("Bhargav");
		List<User> userList=new ArrayList();
		userList.add(user1);
		userList.add(user);
		
		userList.stream().filter(a-> a.getAge()<=30).forEach(a->System.out.println(a.getAge()+"  "+a.getName()));
	}

}
