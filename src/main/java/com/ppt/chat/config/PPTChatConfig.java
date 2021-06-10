package com.ppt.chat.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.ppt.chat.endpoint.UsersEndPoint;

@Configuration
public class PPTChatConfig extends ResourceConfig {

	public  PPTChatConfig() {
		
		register(UsersEndPoint.class);
	}
	
}
