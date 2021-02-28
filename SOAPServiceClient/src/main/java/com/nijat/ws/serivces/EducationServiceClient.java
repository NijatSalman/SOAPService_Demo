/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nijat.ws.serivces;

import com.nijat.ws.EducationService;
import com.nijat.ws.EducationService_Service;
import com.nijat.ws.User;

/**
 *
 * @author Nijat
 */
public class EducationServiceClient {
    
    public static User getUser(String name) {
    
            EducationService_Service service = new EducationService_Service();
            EducationService port = service.getEducationServicePort();
            User result = port.getUser(name);
            System.out.println("Result = "+result);
      
            return result;

    }
}
