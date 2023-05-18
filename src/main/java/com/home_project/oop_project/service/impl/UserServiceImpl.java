package com.home_project.oop_project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home_project.oop_project.entity.User;
import com.home_project.oop_project.repository.UserRepository;
import com.home_project.oop_project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User User) {
		return userRepository.save(User);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUser(User User) {
		return userRepository.save(User);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);	
	}
}
