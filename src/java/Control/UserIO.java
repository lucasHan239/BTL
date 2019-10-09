/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Data.User;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class UserIO {
    
    static ArrayList<User> listUser = new ArrayList<User>();
    public static void Read(){
        try(BufferedReader Br = new BufferedReader(new FileReader (new File ("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTL\\src\\java\\Data\\User.txt")))){
        
        String beet = "";
        
        while ((beet = Br.readLine())!= null){
            User newUser = new User();
            newUser.setUser(beet);
            newUser.setPassword(Br.readLine());
            listUser.add(newUser);
        }
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public static void Write(String User, String Password) {
        try(BufferedWriter Bw = new BufferedWriter(new FileWriter (new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTL\\src\\java\\Data\\User.txt"), true))){
            Bw.newLine();            
            Bw.write(User);
            Bw.newLine();
            Bw.write(Password);

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
