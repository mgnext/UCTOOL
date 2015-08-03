package com.xtremenetworkx.controllers;

import com.xtremenetworkx.UserManager;

public class UserController {


    public String getUsers(){

        UserManager userManager = new UserManager();
        String  Test= userManager.Test();
        System.out.println(Test);    
        return Test;
    }
}
