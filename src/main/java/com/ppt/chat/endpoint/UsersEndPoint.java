package com.ppt.chat.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppt.chat.consts.UriConsts.UserURIConstants;
import com.ppt.chat.domain.Users;
import com.ppt.chat.service.UserService;

@Component
@Path(UserURIConstants.ROOT)
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public class UsersEndPoint {
	
	private static final Logger LOG = LoggerFactory.getLogger(UsersEndPoint.class);
	
	@Autowired
	private UserService userServiceImpl;
	
	@GET
	@Path(UserURIConstants.GETALLUSER)
	public List<Users> getAllUsers() {
		System.err.println("Inside getAlluser Api");
		return userServiceImpl.getAllUserDetails();
	}
}
