package com.ppt.chat.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.ppt.chat.consts.UriConsts.UserURIConstants;

@Component
@Path(UserURIConstants.ROOT)
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public class UsersEndPoint {

}
