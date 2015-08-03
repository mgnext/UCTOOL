package com.xtremenetworkx;

import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLError;
import com.cisco.axlapiservice.AXLPort;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

    public String Test(){
        AXLPort p = new AXLAPIService().getAXLPort();
        try {
            return p.listUser(new ListUserReq()).getReturn().getUser().get(0).getTelephoneNumber();
        } catch (AXLError ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
