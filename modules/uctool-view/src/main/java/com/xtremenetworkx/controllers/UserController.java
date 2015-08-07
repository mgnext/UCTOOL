package com.xtremenetworkx.controllers;

import com.cisco.axl.api._10.LUser;
import com.xtremenetworkx.UserManager;
import java.util.List;

public class UserController {


    public List<LUser> getUsers(){

        UserManager userManager = new UserManager();
        List<LUser> userList = userManager.Test();
        System.out.println("userList"+ userList.size());    
        return userList;
    }
}
