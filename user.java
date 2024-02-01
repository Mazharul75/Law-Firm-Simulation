

import java.lang.*;

public abstract class user {
    private String username;
    private String password;
	private String email;
	private String fName;
	private String lName;

    
    public user(String username, String password, String email, String fName, String lName) {
        this.username = username;
        this.password = password;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }
	
	public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
	public void setEmail(String email) {
        this.email = email;
    }
	
	public void setFName(String fName){
		this.fName = fName;
	}
	
	public void setLName(String lName){
		this.lName = lName;
	}


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
	
	public String getEmail() {
        return email;
    }
	
	public String getFName(){
		return fName;
	}
	
	public String getLName(){
		return lName;
	}

    
}
