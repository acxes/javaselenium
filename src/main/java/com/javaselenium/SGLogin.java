package com.javaselenium;

public class SGLogin extends Driver {
    
   public void testLogin(){
        this.driver.get("https://app.soccergeeks.com/login");
    }
}
