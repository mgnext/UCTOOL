package com.xtremenetworkx.controllers;

import com.xtremenetworkx.UserManager;

public class UserController {


    public String getUsers(){

        UserManager userManager = new UserManager();
        userManager.Test();
        return "TEST UserController";
    }
}
