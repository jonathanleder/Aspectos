package aop.domain.portsin;

import java.util.List;

public interface Users {
	List<User> users();
	
	User userById(int id);
	
	List<User> usersByName(String userName);
}
