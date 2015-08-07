/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtremenetworkx.controllers.ajax;

import com.cisco.axl.api._10.LDeviceProfile;
import com.cisco.axl.api._10.LUser;
import com.google.gson.Gson;
import com.xtremenetworkx.controllers.DeviceProfileController;
import com.xtremenetworkx.controllers.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xtreme
 */
public class getDeviceProfileByName extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List<LDeviceProfile> deviceProfiles = new DeviceProfileController().getDeviceProfilebyUserName("");
            Gson gson = new Gson();
                
                //out.print("{\"suggestions\":"+json+"}"); 
                out.print("{\"suggestions\" : [");
                int length = deviceProfiles.size();  
                
                for(int i = 0; i < length-1;i++)
                {
                    String json = gson.toJson(deviceProfiles.get(i));
                    //out.print("{ \"Value\": \""+deviceProfiles.get(i).get+"\", \"data\": "+json +"},");
                }
                String json = gson.toJson(deviceProfiles.get(length-1));
               // out.print(" {\"Value\": \""+deviceProfiles.get(length-1).getLastName()+"\", \"data\": "+json+"}");
                out.print("] }");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
