package com.xtremenetworkx.controllers;

import com.cisco.axl.api._10.LDeviceProfile;
import com.cisco.axl.api._10.ListDeviceProfileReq;
import com.xtremenetworkx.DeviceProfileManager;
import java.util.List;

public class DeviceProfileController {


    public List<LDeviceProfile> getDeviceProfilebyUserName(String lastName){

        DeviceProfileManager deviceProfileManager = new DeviceProfileManager();
        LDeviceProfile deviceProfileRequest =  new LDeviceProfile();
        deviceProfileRequest.setUuid("?");
        deviceProfileRequest.setDefaultProfileName("?");
        deviceProfileRequest.setModel("?");
                
        ListDeviceProfileReq axlParams = new ListDeviceProfileReq();
        ListDeviceProfileReq.SearchCriteria criteria = new ListDeviceProfileReq.SearchCriteria();
        criteria.setName(lastName);
        axlParams.setSearchCriteria(criteria);
       
        List<LDeviceProfile> deviceProfileList = deviceProfileManager.listDeviceProfilesByUserID(criteria,deviceProfileRequest);
        
        return deviceProfileList;
    }
   
}
