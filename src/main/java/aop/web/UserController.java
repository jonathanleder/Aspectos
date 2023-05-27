package aop.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aop.domain.portsin.User;
import aop.domain.portsin.Users;

@RestController
public class UserController {

	private Users users;
	
	public UserController(Users users) {
		this.users = users;
	}
	
	@GetMapping("/users")
	public List<User> allUsers() {
		return this.users.users();
	}

	@GetMapping("/users/{id}")
	public User usersById(@PathVariable String id) {
		return this.users.userById(Integer.valueOf(id));		
	}
}
