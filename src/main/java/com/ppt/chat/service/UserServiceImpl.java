package com.ppt.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppt.chat.domain.Users;
import com.ppt.chat.repository.UsersRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UsersRepo userRepository;
	
	@Override
	public Users getUserDetail(String email, String password) {
		return null;
	}

	@Override
	public List<Users> getAllUserDetails() {
		System.err.println("Inside Impl part");
		List<Users> userDetailList = userRepository.findAll();
		userDetailList.forEach(s->{
			System.err.println(s);
		});
		return userDetailList;
	}

}
