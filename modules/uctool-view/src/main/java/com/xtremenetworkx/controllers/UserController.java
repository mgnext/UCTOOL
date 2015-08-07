package com.xtremenetworkx.controllers;

import com.cisco.axl.api._10.LUser;
import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axl.api._10.XUser;
import com.xtremenetworkx.UserManager;
import java.util.List;

public class UserController {


    public List<LUser> getUsers(){

        UserManager userManager = new UserManager();
        List<LUser> userList = userManager.Test();
        System.out.println("userList"+ userList.size());    
        return userList;
    }
    public String addUser(){

        UserManager userManager = new UserManager();
        XUser user = new XUser();
        user.setFirstName("Test 3");
        user.setLastName("User");
        user.setUserid("testuser3");
        String response = userManager.addUser(user);
        System.out.println(response);    
        return response;
    }
    
    public List<LUser> getUserByName(String lastName){

        UserManager userManager = new UserManager();
        LUser userRequest = new LUser();
        userRequest.setFirstName("?");
        userRequest.setLastName("?");
        userRequest.setUuid("?");
        
        ListUserReq axlParams = new ListUserReq();
        ListUserReq.SearchCriteria criteria =  new ListUserReq.SearchCriteria();
        criteria.setLastName("%"+lastName+"%");
        axlParams.setSearchCriteria(criteria);
        List<LUser> users = userManager.listUsers(criteria,userRequest);
        
        return users;
    }
}
