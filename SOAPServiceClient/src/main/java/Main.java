
import com.nijat.ws.User;
import com.nijat.ws.serivces.EducationServiceClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nijat
 */
public class Main {
    public static void main(String[] args) {
        User user=EducationServiceClient.getUser("Nijat");
        System.out.println("User -"+user.getName());
    }
}
