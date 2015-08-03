package com.xtremenetworkx;

import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLError;
import com.cisco.axlapiservice.AXLPort;
import static com.xtremenetworkx.Configs.AXL_URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.BindingProvider;

public class UserManager {

    public String Test(){
        AXLPort axlPort = new AXLAPIService().getAXLPort();
        
((BindingProvider) axlPort).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, AXL_URL);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Configs.CU_USERNAME);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Configs.CU_PASSWORD);

        try {
            return axlPort.listUser(new ListUserReq()).getReturn().getUser().get(0).getFirstName();
        } catch (AXLError ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
