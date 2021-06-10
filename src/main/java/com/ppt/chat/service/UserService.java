package com.ppt.chat.service;

import java.util.List;

import com.ppt.chat.domain.Users;

public interface UserService {
   Users getUserDetail(String email,String password);
   
   List<Users> getAllUserDetails();
}
