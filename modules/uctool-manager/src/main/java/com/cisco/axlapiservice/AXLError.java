
package com.cisco.axlapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-08-05T01:25:24.666+05:30
 * Generated source version: 2.7.16
 */

@WebFault(name = "axlError", targetNamespace = "http://www.cisco.com/AXL/API/10.5")
public class AXLError extends Exception {
    
    private com.cisco.axl.api._10.AXLError axlError;

    public AXLError() {
        super();
    }
    
    public AXLError(String message) {
        super(message);
    }
    
    public AXLError(String message, Throwable cause) {
        super(message, cause);
    }

    public AXLError(String message, com.cisco.axl.api._10.AXLError axlError) {
        super(message);
        this.axlError = axlError;
    }

    public AXLError(String message, com.cisco.axl.api._10.AXLError axlError, Throwable cause) {
        super(message, cause);
        this.axlError = axlError;
    }

    public com.cisco.axl.api._10.AXLError getFaultInfo() {
        return this.axlError;
    }
}
