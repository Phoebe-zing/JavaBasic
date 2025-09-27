package controlflow;

import javax.swing.*;

public class SampleProject3 {

    public static void main(String[] args) {

        String username = null;
        String password = null;

        boolean running = true;

        while(running){
            //first if
            if(username == null){
                String inputUsername = JOptionPane.showInputDialog("Please Enter your name: ");
                //second if
                if(inputUsername.contentEquals("Admin")){
                    username = inputUsername;
                 }

            }
            else{
                String inputPassword = JOptionPane.showInputDialog("Please Enter your password: ");
                //second if
                if(inputPassword.contentEquals("12345")){
                    password = inputPassword;
                    if(username.equals("Admin") && password.equals("12345")){
                        JOptionPane.showMessageDialog(null, "Login Successful.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Login Fail.");
                    }
                    running = false;
                }

            }
        }
    }
}
