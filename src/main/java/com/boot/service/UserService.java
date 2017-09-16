/**
 * 
 */
package com.boot.service;

import java.util.List;

import com.boot.model.User;

/**
 * @author Prashant
 *
 */
public interface UserService {
	User findById(Long id);

	User findByName(String name);

	User saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);

}
