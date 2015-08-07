package com.xtremenetworkx;

import com.cisco.axl.api._10.AddUserReq;
import com.cisco.axl.api._10.LDeviceProfile;
import com.cisco.axl.api._10.ListDeviceProfileReq;
import com.cisco.axl.api._10.ListDeviceProfileRes;
import com.cisco.axl.api._10.StandardResponse;
import com.cisco.axl.api._10.XUser;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLError;
import com.cisco.axlapiservice.AXLPort;
import static com.xtremenetworkx.Configs.AXL_URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.BindingProvider;

public class DeviceProfileManager {
    
    public List<LDeviceProfile> listDeviceProfilesByUserID(ListDeviceProfileReq.SearchCriteria criteria, LDeviceProfile returnedTags){
        AXLPort axlPort = new AXLAPIService().getAXLPort();
        
((BindingProvider) axlPort).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, AXL_URL);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Configs.CU_USERNAME);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Configs.CU_PASSWORD);

        try {
            ListDeviceProfileReq axlParams = new ListDeviceProfileReq();
            axlParams.setSearchCriteria(criteria);
        
            axlParams.setReturnedTags(returnedTags);
            System.out.println("listDeviceProfilesByUserID");
 
//Make a call to the AXL Service and pass the getPhone request
        ListDeviceProfileRes listDeviceProfile = axlPort.listDeviceProfile(axlParams);
 
//display information returned in the response to the user
        return listDeviceProfile.getReturn().getDeviceProfile();
        } catch (AXLError ex) {
            Logger.getLogger(DeviceProfileManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String addUser(XUser user){
        AXLPort axlPort = new AXLAPIService().getAXLPort();
        
((BindingProvider) axlPort).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, AXL_URL);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Configs.CU_USERNAME);
((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Configs.CU_PASSWORD);

        try {
            AddUserReq axlParams = new AddUserReq();
            axlParams.setUser(user);
            System.out.println("AddUserReq");
 
//Make a call to the AXL Service and pass the getPhone request
            StandardResponse addUserResponse = axlPort.addUser(axlParams);
 
//display information returned in the response to the user
        return addUserResponse.getReturn();
        } catch (AXLError ex) {
            Logger.getLogger(DeviceProfileManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
