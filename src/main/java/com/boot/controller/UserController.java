/**
 * 
 */
package com.boot.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.User;
import com.boot.serviceImpl.UserServiceImpl;

/**
 * @author Prashant
 *
 */
@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PersistenceContext
	EntityManager entityManager;

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public User registerUser(@RequestBody User user) {
		System.out.println("User :" + user.toString());
		return userServiceImpl.saveUser(user);
	}

	@RequestMapping(value = "loginUser", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String login(@PathParam(value = "username") String username, @PathParam(value = "password") String password) {
		System.out.println("User :" + username);
		System.out.println("Password :" + password);
		List<User> usersList = userServiceImpl.findAllUsers();
		if(null != usersList && !usersList.isEmpty()){
			for(User user : usersList){
				if(user.getUsername().equals(username)){
					if (null != getActualPassword(username) && password.equals(getActualPassword(username))) {
						return username;
					}
				}
			}
		}
		return "Failure";
	}

	/**fetched actual password for specified username
	 * @param username
	 * @return actualPassword
	 */
	private String getActualPassword(String username) {
		Query q = entityManager.createNativeQuery("SELECT password FROM user_details WHERE username= :username");
		q.setParameter("username", username);
		String actualPassword = (String) q.getSingleResult();	
		return actualPassword;
	}

	/**finds all registred users 
	 * @return
	 */
	@RequestMapping(value = "getUsers", method = RequestMethod.GET)
	public List<User> getUserList() {
		return userServiceImpl.findAllUsers();
	}

}
