
package cine;


public class Usuarios {
    String profile,user,passw;
    Usuarios(String profile, String user, String passw){
        this.profile = profile;
        this.user = user;
        this.passw = passw;
    }
    
    public String getProfile(){
        return profile;
    }
    
    public String getUser(){
        return user;
    }
    
    public String getPassw(){
        return passw;
    }
           
}
