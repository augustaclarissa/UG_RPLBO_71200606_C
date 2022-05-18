package com.ug11.instapost;

import java.util.Locale;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){
        this.email = email;
        this.username = username.toUpperCase();
        this.totalMention;
    }

    public void printInfo(){
        System.out.println(email);
    }

    public void login(String email) throws EmailException{
        try {
            if (email.contains("@gmail.com")) {
                System.out.println("Login berhasil!");
            }
            else if (!email.contains("@")){
                throw new EmailException(1);
            }
            else if (!email.contains("gmail.com")){
                throw new EmailException(2);
            }
            else{
                break;
            }
        } catch(EmailException e){
            System.out.println("Error : " + e.getErrorMessage());
        }
    }

    public void post(String username){
        if (username.contains("@")){
            continue;
        }
    }
}
