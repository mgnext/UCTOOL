/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtremenetworkx;

import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLPort;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public void businessMethod() {
        AXLAPIService axlservice = new AXLAPIService();
        AXLPort axl = axlservice.getAXLPort();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
