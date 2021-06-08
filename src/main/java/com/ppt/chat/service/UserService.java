package com.ppt.chat.service;

import com.ppt.chat.domain.Users;

public interface UserService {
   Users getUserDetail(String email,String password);
}
