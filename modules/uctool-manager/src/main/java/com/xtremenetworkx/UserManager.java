package com.xtremenetworkx;

import com.cisco.axl.api._10.GetPhoneReq;
import com.cisco.axl.api._10.GetPhoneRes;
import com.cisco.axl.api._10.GetUserReq;
import com.cisco.axl.api._10.LUser;
import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axl.api._10.ListUserRes;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLError;
import com.cisco.axlapiservice.AXLPort;
import static com.xtremenetworkx.Configs.AXL_URL;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.BindingProvider;

public class UserManager {

    public List<LUser> Test(){
        AXLPort axlPort = new AXLAPIService().getAXLPort();
        
((BindingProvider) axlPort).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, AXL_URL);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Configs.CU_USERNAME);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Configs.CU_PASSWORD);

        try {
            ListUserReq axlParams = new ListUserReq();
            ListUserReq.SearchCriteria criteria =  new ListUserReq.SearchCriteria();
            criteria.setFirstName("Na%");
            axlParams.setSearchCriteria(criteria);
            
            LUser returnedTags =new LUser();
            returnedTags.setFirstName("?");
            axlParams.setReturnedTags(returnedTags);
            System.out.println("ListUserReq");
 
//Make a call to the AXL Service and pass the getPhone request
        ListUserRes listUserResponse = axlPort.listUser(axlParams);
 
//display information returned in the response to the user
        return listUserResponse.getReturn().getUser();
        } catch (AXLError ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<LUser> listUsers(ListUserReq.SearchCriteria criteria, LUser returnedTags){
        AXLPort axlPort = new AXLAPIService().getAXLPort();
        
((BindingProvider) axlPort).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, AXL_URL);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Configs.CU_USERNAME);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Configs.CU_PASSWORD);

        try {
            ListUserReq axlParams = new ListUserReq();
            axlParams.setSearchCriteria(criteria);
        
            axlParams.setReturnedTags(returnedTags);
            System.out.println("ListUserReq");
 
//Make a call to the AXL Service and pass the getPhone request
        ListUserRes listUserResponse = axlPort.listUser(axlParams);
 
//display information returned in the response to the user
        return listUserResponse.getReturn().getUser();
        } catch (AXLError ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
